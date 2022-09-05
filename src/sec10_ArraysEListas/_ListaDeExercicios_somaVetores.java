package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_somaVetores {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		
		System.out.println("Digite os valores do vetor A");
		for (int i=0; i<n; i++) {
			a[i] = sc.nextDouble();
		}
		
		System.out.println("Digite os valores do vetor B");
		for (int i=0; i<n; i++) {
			b[i] = sc.nextDouble();
		}
		
		System.out.println("VETOR RESULTANTE DA SOMA: ");
		for (int i=0; i<n; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
		sc.close();
	}
}
