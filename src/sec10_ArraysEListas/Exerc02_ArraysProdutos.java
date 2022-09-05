package sec10_ArraysEListas;

import java.util.Scanner;

import entidades.Produto02;

public class Exerc02_ArraysProdutos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos deseja cadastrar? ");
		int n = sc.nextInt();
		Produto02[] listaProdutos = new Produto02[n];
		
		System.out.println("Informe abaixo o nome e o preço do produtos, respectivamente:");
		double soma = 0.0;
		
		for (int p = 0; p < n; p++ ) {
			sc.nextLine(); // Para receber o Enter
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			soma += preco;
			
			listaProdutos[p] = new Produto02(nome, preco);
		}
		
		double media = soma/n;
		
		System.out.printf("A média dos preços é R$ %.2f%n", media);
		
		sc.close();
	}
}
