package sec10_ArraysEListas;

import java.util.Scanner;

public class Exerc01_CriandoArrays {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alturas deseja contabilizar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Informe a %dª altura: ", i+1);
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma/n;
		System.out.printf("\nA média das alturas é %.2f", media);
		
		sc.close();
	}
}
