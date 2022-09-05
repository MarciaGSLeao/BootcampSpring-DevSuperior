package sec10_ArraysEListas;

import java.util.Scanner;

import entidades.Quarto;

public class Exerc03_Quartos {
	
	public static void main(String[] args) {
		
		Quarto[] listaQuartos = new Quarto[10];
		
		Scanner sc = new Scanner(System.in);
		
 		System.out.print("Quantos quartos serão locados? ");
		int qtdQuartos = sc.nextInt();
		
		sc.nextLine();
		
		for(int p = 0; p < qtdQuartos; p++) {
			
			System.out.printf("\n%dº Hóspede: ", p+1);
			System.out.print("\nNome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Nº Quarto: ");
			int numero = sc.nextInt();
			sc.nextLine();
			
			listaQuartos[p] = new Quarto(nome, email, numero);
		}
		
		System.out.println("\nQUARTOS LOCADOS");
		
		for (int p = 0; p < qtdQuartos; p++) {
			if (listaQuartos[p] != null) {
				System.out.println(listaQuartos[p].toString());
			}
		}
		
		sc.close();
	}
}
