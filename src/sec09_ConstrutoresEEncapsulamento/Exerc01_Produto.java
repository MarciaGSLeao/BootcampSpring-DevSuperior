package sec09_ConstrutoresEEncapsulamento;

import java.util.Scanner;
import entidades.Produto01;

public class Exerc01_Produto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double preco;
		int qtd;
		
		System.out.println("Informe os dados do produto: ");
		
		System.out.print("Nome: ");
		nome = entrada.nextLine();
		System.out.print("Preço: ");
		preco = entrada.nextDouble();
		System.out.print("Quantidade em estoque: ");
		qtd = entrada.nextInt();
		
		Produto01 produto = new Produto01(nome, preco, qtd);
		
		System.out.println();
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o número de produtos que deseja adicionar: ");
		qtd = entrada.nextInt();
		produto.adicionarProduto(qtd);
		System.out.println("\nDados atualizados: ");
		System.out.println(produto.toString());
		
		System.out.println();
		System.out.print("Entre com o número de produtos que deseja remover: ");
		qtd = entrada.nextInt();
		produto.removerProduto(qtd);
		System.out.println("\nDados atualizados: ");
		System.out.println(produto.toString());
		
		entrada.close();
	}
}
