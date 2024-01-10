package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Informe o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Informe o preço do m²: ");
		double precoMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * precoMetroQuadrado;
		
		System.out.printf("AREA = %.2fm²%n", area);
		System.out.printf("PREÇO = R$ %.2f", preco);
		
		sc.close();
		
	}

}
