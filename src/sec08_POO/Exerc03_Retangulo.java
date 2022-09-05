package sec08_POO;

import java.util.Scanner;
import entidades.Retangulo;

public class Exerc03_Retangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		

		System.out.println("Informe a altura e a largura do retângulo.");
		System.out.print("Altura: ");
		retangulo.altura = entrada.nextDouble();
		System.out.print("Largura: ");
		retangulo.largura = entrada.nextDouble();
		
		System.out.println();
		System.out.println("ÁREA: " + retangulo.area());
		System.out.println("PERÍMETRO: " + retangulo.perimetro());
		System.out.println("DIAGONAL: " + String.format("%.2f", retangulo.diagonal()));
		
		entrada.close();
	}
}
