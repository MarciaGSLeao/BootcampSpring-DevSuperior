package sec10_ArraysEListas;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		int[][] matriz = new int[n][n];
		
		for (int l=0; l<n;l++) {
			for (int c=0; c<n;c++) {
				matriz[l][c] = entrada.nextInt();
			}
		}
		
		System.out.print("DIAGONAL = ");
		for (int i=0; i<matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int l=0; l<n;l++) {
			for (int c=0; c<n;c++) {
				if (matriz[l][c] < 0) {
					count ++;
				}
			}
		}
		
		System.out.println("NÚMEROS NEGATIVOS = " + count);
		
		entrada.close();
		
		
	}
}
