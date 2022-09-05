package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_mediaPares {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int nElem = sc.nextInt();
		double[] vetor = new double[nElem];
		double somaDosPares = 0;
		double totalDePares = 0;
		double mediaDosPares = 0;
		
		for(int i=0; i< nElem; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		int i=0;
		if (vetor[i] % 2 == 0) {
			somaDosPares += vetor[i];
			totalDePares++;
			mediaDosPares = somaDosPares / totalDePares;
			System.out.printf("MÉDIA DOS PARES = %.2f", mediaDosPares);
		}else {
			System.out.println("NÃO HÁ NÚMEROS PARES.");
		}
		sc.close();
	}
}
