package sec07;

import java.util.Scanner;

public class Exec01_ImplementandoConceitoDeFuncoes {
	
	public static void main(String[] args) {
		// Faça um programa que receba 3 números inteiros e mostra na tela o maior.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe 3 números: ");
		
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		
		entrada.close();
	}
	
	public static int max(int x, int y, int z) {
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}else if (y > x && y > z) {
			aux = y;
		}else {	
			aux = z;
		}
		
		return aux;
	}
	
	public static void showResult(int value){
		
		System.out.println("Higher: " + value);
	}

}
