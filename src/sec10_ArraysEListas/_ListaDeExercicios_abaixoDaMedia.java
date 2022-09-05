package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_abaixoDaMedia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma = 0;
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		double media = soma/(double)n;
		
		System.out.printf("\nMEDIA DO VETOR: %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
	
		sc.close();
	}

}
