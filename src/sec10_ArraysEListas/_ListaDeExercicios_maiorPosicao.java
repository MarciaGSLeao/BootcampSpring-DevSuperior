package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_maiorPosicao {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] vetor;

		System.out.print("Qauntos números você vai digitar? ");
		int n = sc.nextInt();
		vetor = new double[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		//System.out.println(vetor[1]);
		
		double maior = vetor[0];
		int posicao = 0;
		
		for (int i=0; i<vetor.length;i++) {
			if (vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.2f", maior);
		System.out.printf("\nPOSIÇÃO DO MAIOR VALOR = %d", posicao);
		
		sc.close();
	}
}
