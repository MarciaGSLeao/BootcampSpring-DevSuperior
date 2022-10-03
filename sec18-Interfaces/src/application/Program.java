package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		
		System.out.println("Informe os dados do aluguel:");
		
		System.out.print("Modelo do carro: ");
		String vehicle = sc.nextLine();
		System.out.print("Data da retirada (dd/MM/yyyy hh:mm):");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Data da devolução (dd/MM/yyyy hh:mm):");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(vehicle));
		
		System.out.print("Informe o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Informe o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("DADOS DA NOTA: ");
		System.out.println("Valor Base: R$ " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
		System.out.println("Imposto: R$ " + String.format("%.2f", carRental.getInvoice().getTax()));
		System.out.println("Valor Total: R$ " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		
		sc.close();
		
	}

}
