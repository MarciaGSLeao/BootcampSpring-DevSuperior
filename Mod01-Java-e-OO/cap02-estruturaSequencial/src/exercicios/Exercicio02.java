package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		// ENTRADA DE DADOS.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Informe seu salário: ");
		double salario = sc.nextInt();
		System.out.print("Informe seu sexo: ");
		char sexo = sc.next().charAt(0);
		
		System.out.printf("Dados: %s - %d anos - R$ %.2f - %s", nome, idade, salario, sexo );
		
		sc.close();
		
	}

}
