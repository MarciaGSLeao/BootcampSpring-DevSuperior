package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program6_GeometricShapes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Shape> listShapes= new ArrayList<>();
		
		System.out.print("Informe o número de formas geométricas: ");
		int totalShapes = sc.nextInt();
		
		for(int i = 1; i <= totalShapes; i++) {
			System.out.printf("\nForma Geométrica %d:%n", i);
			System.out.print("Retângulo ou Círculo (r/c)? ");
			char rc = sc.next().charAt(0);
			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Color color = Color.valueOf(sc.next());
			
			if(rc == 'r') {
				System.out.print("Largura: ");
				Double width = sc.nextDouble();
				System.out.print("Altura: ");
				Double height = sc.nextDouble();
				listShapes.add(new Rectangle(color, width, height));
			}else {
				System.out.println("Raio: ");
				Double radius = sc.nextDouble();
				listShapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("Áreas das Formas Geométricas Informadas:");
		
		for(Shape shape: listShapes) {
			System.out.printf("%.2f%n", shape.getArea());
		}
		
		sc.close();
	}

}
