package sec08_POO;

import java.util.Scanner;

import entidades.Triangulo;

public class Exerc01_v2 {
	
	public static void main(String[] args) {
		
		// Exempo de aplicação do conceito de Programação Orientada a Objetos.
		// Ler as medidas do lado de dois triângulo distintos
		// em seguida mostrar o valor da área de cada um
		// e qual triângulo possui maior área.
		
		Scanner entrada = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as medidas dos lados do primeiro triângulo: ");
		x.ladoA = entrada.nextDouble(); // chamada dos atributos...
		x.ladoB = entrada.nextDouble();
		x.ladoC = entrada.nextDouble();
		
		System.out.println("Informe as medidas dos lados do segundo triângulo: ");
		y.ladoA = entrada.nextDouble();
		y.ladoB = entrada.nextDouble();
		y.ladoC = entrada.nextDouble();
		
		double xArea = x.area(); // Chamada do método "area"...
		double yArea = y.area();

		System.out.printf("Área do Primeiro Triângulo: %.2f%n", xArea);
		System.out.printf("Área do Segundo Triângulo: %.2f%n", yArea);
		
		if (xArea > yArea) {
			System.out.printf("O Primeiro Triângulo é o maior: %.2f%n", xArea);
		}else {
			System.out.printf("O Segundo Triângulo é o maior: %.2f%n", yArea);
		}
		
		entrada.close();
		
	}

}
