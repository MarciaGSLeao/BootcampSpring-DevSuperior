package exercicios;

import entidades.Produto;

import java.util.ArrayList;
import java.util.Scanner;

// FAZER UM PROGRAMA PARA ARMAZENAS UMA LISTA DE PRODUTOS EM UM VETOR.
public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int qtdProdutos = 0;
		double precoMedio = 0.0;
		double precoTotal = 0.0;
		ArrayList<Produto> produtos = new ArrayList<>();

		System.out.print("Informe a quantidade de produtos que deseja armazenar: ");
		qtdProdutos = sc.nextInt();

		for (int i = 0; i < qtdProdutos; i++) {
			System.out.printf("%nInforme o nome do %dº produto: ", i + 1);
			sc.next();
			String nomeDoProduto = sc.nextLine();
			System.out.printf("Informe o preço do %dº produto: ", i + 1);
			double precoDoProduto = sc.nextDouble();
			produtos.add(new Produto(nomeDoProduto, precoDoProduto));
		}

		for (Produto produto : produtos) {
			precoTotal += produto.getPrice();
		}

		precoMedio = precoTotal / qtdProdutos;

		System.out.printf("%nPreço total dos produtos: %.2f%n", precoTotal);
		System.out.printf("Preço médio dos produtos: %.2f%n", precoMedio);

		sc.close();
		
	}

}
