package app;

import java.util.Scanner;

import entidades.Product;
import entidades.Quadrado;

public class ProgramaProduto {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Product prodA = new Product();
		
		System.out.println("Informe o nome do produto: ");
		prodA.setName(sc.nextLine());
		System.out.println("Informe o preço do produto: ");
		prodA.setPrice(sc.nextDouble());
		System.out.println("Informe a quantidade do produto: ");
		prodA.setQuantity(sc.nextInt());
		
		System.out.printf("R$ %.2f%n%n", prodA.totalValueInStock());

		System.out.println("Adicione mais quantidade.. ");
		prodA.addProduct(sc.nextInt());
		System.out.printf("Estoque atualizado: %d kgs. %n", prodA.getQuantity());
		System.out.printf("Estoque(R$) atualizado: R$ %.2f%n%n", prodA.totalValueInStock());
		
		System.out.println("Retire mais quantidade.. ");
		prodA.removeProduct(sc.nextInt());
		System.out.printf("Estoque atualizado: %d kgs. %n", prodA.getQuantity());
		System.out.printf("Estoque(R$) atualizado: R$ %.2f%n%n", prodA.totalValueInStock());
		
		System.out.println(prodA.toString());
		
		sc.close();		

	}

}
