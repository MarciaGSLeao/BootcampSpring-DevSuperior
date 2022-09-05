package sec04_EstruturasSequenciais;

import java.util.Scanner;

public class _ListaDeExercicios_ResolucaoQ2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		double pi = 3.14159;
		
		System.out.println("CALCULANDO A ÁREA DE UMA CIRCUNFERÊNCIA:");
		System.out.print("\nInforme o tamanho do raio: ");
		raio = entrada.nextInt();
		double areaCirc = pi*(raio*raio);
		System.out.printf("\nA área da circunferência de raio %.2f é %.4f", raio, areaCirc);
		
		entrada.close();
	}
}
