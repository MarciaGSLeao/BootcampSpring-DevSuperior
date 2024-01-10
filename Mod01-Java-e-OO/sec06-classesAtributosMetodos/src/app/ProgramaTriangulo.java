package app;

import java.util.Scanner;

import entidades.Triangulo;

public class ProgramaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		
		System.out.println("Informe as medidas do triângulo: ");
		x.setLadoA(sc.nextDouble());
		x.setLadoB(sc.nextDouble());
		x.setLadoC(sc.nextDouble());
			
		System.out.printf("Perímetro: %.2f%n", x.calcPerimetro());	
		System.out.printf("Área: %.2f%n", x.calcArea());
				
		sc.close();		
	}

}
