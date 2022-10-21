package exercises;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		
		System.out.println("CALCULANDO A �REA DE UMA CIRCUNFER�NCIA:");
		System.out.print("\nInforme o tamanho do raio: ");
		raio = entrada.nextInt();
		double areaCirc = pi*(raio*raio);
		System.out.printf("\nA �rea da circunfer�ncia de raio %.2f � %.4f", raio, areaCirc);
		
		entrada.close();
	}
}
