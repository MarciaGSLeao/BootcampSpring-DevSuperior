package app;

import entidade.Produto;

import java.util.Scanner;

public class Vetores2 {

    public static void main(String[] args) {

        /*
         Fazer um programa para ler um número inteiro N e os dados (nome
         e preço) de N produtos. Armazene as N alturas em um vetor.
         Em seguida, mostrar o preço médio dos produtos.
        */

        int totalDeProdutos;
        double soma = 0.0;
        double mediaPreco;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de produtos a ser cadastrada: ");
        totalDeProdutos = sc.nextInt();
        Produto[] listaProdutos = new Produto[totalDeProdutos];

        for (int i = 0; i < totalDeProdutos; i++) {
            System.out.println("Informe o nome do produto: ");
            sc.next();
            String nomeProduto = sc.nextLine();
            System.out.println("Informe o preco do produto: ");
            Double precoProduto = sc.nextDouble();
            listaProdutos[i] = new Produto(nomeProduto, precoProduto);
        }

        for (int i = 0; i < totalDeProdutos; i++) {
            soma += listaProdutos[i].getPreco();
        }

        mediaPreco = soma / totalDeProdutos;
        System.out.printf("Altura Média: %.2f%n", mediaPreco);

        sc.close();

    }
}
