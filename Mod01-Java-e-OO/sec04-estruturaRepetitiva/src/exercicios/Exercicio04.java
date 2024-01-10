package exercicios;

import java.util.Scanner;

// ESTRUTURA REPETITIVA DO-WHILE: executa pelo menos uma vez.              
public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double tempC;
		double tempF;
		char escolha;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			tempC = sc.nextDouble();
			tempF = (9 * tempC)/5 + 32;
			System.out.printf("Correspondente em ºF: %.2f%n", tempF);
			System.out.print("Deseja efetuar outra conversão? ");
			escolha = sc.next().charAt(0);
		}while(escolha == 's');
		
		System.out.println("END OF PROGRAM =)");
		sc.close();
		
	}

}
