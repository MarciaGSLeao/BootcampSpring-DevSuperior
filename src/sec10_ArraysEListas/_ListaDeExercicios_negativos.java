package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_negativos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Quantos números deseja armazenar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS: ");
		for (int i=0; i<n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		System.out.println("Não há números negativos no vetor.");
		
		sc.close();
	}

}
