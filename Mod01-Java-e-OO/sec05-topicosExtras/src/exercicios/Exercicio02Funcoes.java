package exercicios;

import java.util.Scanner;

public class Exercicio02Funcoes {
	
	// OUTRAS FUNÇÕES IMPORTANTES.
	public static void main(String[] args) {
		
		// Fazer um programa que lê três números inteiros e mostrar o maior deles na tela.
		
		Scanner sc = new Scanner(System.in);
		int qtdNum = 3;
		int numEscolhido;
		int numMaior;
		
		System.out.print("Escolha um número: ");
		numEscolhido = sc.nextInt();
		numMaior = numEscolhido;
		
		for(int i = 2; i <= qtdNum; i++) {
			System.out.print("Escolha um número: ");
			numEscolhido = sc.nextInt();
			if (numEscolhido > numMaior) {
				numMaior = numEscolhido;
			}
		}
		
		System.out.printf("MAIOR: %d", numMaior);
		
		sc.close();
		
	}

}
