package app;

import entidade.Produto;
import entidade.Triangulo;

import java.util.Scanner;

public class AplicacaoProduto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;
        double preco;
        int quantidade;

        System.out.println("Informe os dados do produto: ");
        System.out.print("Nome: " );
        nome = sc.nextLine();
        System.out.print("Preço: " );
        preco = sc.nextDouble();
        System.out.print("Quantidade: " );
        quantidade = sc.nextInt();
        Produto p1 = new Produto(nome, preco);
        p1.adicionarProduto(quantidade);

        System.out.println("DADOS DO PRODUTO: ");
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQuantidade());
        System.out.println(p1.valorTotalEmEstoque());

        System.out.println("Informe a quantidade que deseja adicionar ao estoque: ");
        p1.adicionarProduto(sc.nextInt());

        System.out.println("DADOS DO PRODUTO: ");
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQuantidade());
        System.out.println(p1.valorTotalEmEstoque());

        System.out.println("Informe a quantidade que deseja remover do estoque: ");
        p1.removerProduto(sc.nextInt());

        System.out.println("DADOS DO PRODUTO: ");
        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());
        System.out.println(p1.getQuantidade());
        System.out.println(p1.valorTotalEmEstoque());

        sc.close();

    }
}
