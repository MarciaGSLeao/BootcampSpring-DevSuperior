package sec08_POO;

import java.util.Scanner;

import entidades.Esfera;

public class Exerc06_ProgramaEsfera {
	
	public static void main(String[] args) {
		
		// Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a medida do raio: ");
		double raio = entrada.nextDouble();
		
		System.out.printf("Circunferência: %.2f\n", Esfera.circunferencia(raio));
		System.out.printf("Volume: %.2f\n", Esfera.volume(raio));
		System.out.printf("Valor do PI: %.2f", Esfera.PI);
		
		entrada.close();
	}
}
