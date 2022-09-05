package sec06_EstruturasRepetitivas;

import java.util.Scanner;

public class Debugando {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a largura em m²: ");
		double largura = entrada.nextDouble();
		System.out.print("Informe o comprimento em m²: ");
		double comprimento = entrada.nextDouble();
		System.out.print("Informe o preço do m²: ");
		double precoMetroQuadrado = entrada.nextDouble();
		
		double area = largura*comprimento;
		double precoTotal = precoMetroQuadrado*area;
		
		System.out.printf("\nÁREA: %.2f m²", area);
		System.out.printf("\nPREÇO TOTAL: R$ %.2f.", precoTotal);
		
		entrada.close();
		
	}
}
