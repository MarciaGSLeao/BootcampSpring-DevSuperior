package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_somaVetor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você deseja digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite o %dº número: ", i+1 );
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.println("VALORES: ");
		for (int i=0; i<n ;i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		double media = soma/n;
		System.out.printf("%nSOMA: %.1f%n", soma );
		System.out.printf("MÉDIA: %.1f", media );
		
		
		sc.close();
	}

}
