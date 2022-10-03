package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class MainProgramReservation {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("\nNº DO QUARTO: ");
			int roomNumber = sc.nextInt();
			System.out.print("DATA CHECK-IN: ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("DATA CHECK-OUT: ");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
		}catch(ParseException e) {
			System.out.println(e.getMessage());
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.print("\nDeseja fazer alteração na reserva (s/n)? ");
		char updateReservation = sc.next().charAt(0); 
		
		if (updateReservation == 's' || updateReservation == 'S' ) {
			try {
				System.out.print("\nNº DO QUARTO: ");
				int roomNumber = sc.nextInt();
				System.out.print("DATA CHECK-IN: ");
				Date checkIn = sdf.parse(sc.next());
				System.out.print("DATA CHECK-OUT: ");
				Date checkOut = sdf.parse(sc.next());
				
				Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
				System.out.println(reservation);
				
			}catch(ParseException e) {
				System.out.println(e.getMessage());
			}catch(DomainException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("Fim!");
		}
		
		sc.close();
		
	}

}
