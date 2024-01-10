package exercicios;

import java.util.Scanner;

// ESTRUTURA REPETITIVA WHILE              
public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numeroEscolhido = sc.nextInt();
		int somaNumeros = 0;
		
		while(numeroEscolhido != 0) {
			somaNumeros += numeroEscolhido;
			System.out.println("Informe um número: ");
			numeroEscolhido = sc.nextInt();
			
		}
		
		System.out.println("Soma: " + somaNumeros);
		
		sc.close();
		
	}

}
