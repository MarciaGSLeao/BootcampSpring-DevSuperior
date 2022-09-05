package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_numerosPares {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("\nNUMEROS PARES = ");
		for (int i=0; i<vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		
		System.out.print("\n\nQUANTIDADE DE PARES = ");
		int contador=0;
		for (int i=0; i<vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				contador++;
			}
		}
		System.out.print(contador);
				
		sc.close();
	}
}
