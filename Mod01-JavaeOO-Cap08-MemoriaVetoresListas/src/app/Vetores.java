package app;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        /*
         Fazer um programa para ler um número inteiro N e a altura de N
         pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar
         a altura média dessas pessoas.
        */

        int totalDePessoas;
        double soma = 0.0;
        double mediaAltura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o total de alturas a ser cadastrada: ");
        totalDePessoas = sc.nextInt();
        double[] alturas = new double[totalDePessoas];

        for (int i = 0; i < totalDePessoas; i++) {
            System.out.printf("Informe a %dª altura: ", i+1);
            alturas[i] = sc.nextDouble();
            soma += alturas[i];
        }
        mediaAltura = soma / totalDePessoas;

        System.out.printf("Altura Média: %.2f%n", mediaAltura);

        sc.close();

    }
}
