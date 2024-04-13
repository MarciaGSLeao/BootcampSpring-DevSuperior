import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {
        /**
         * Fazer um programa que lê um valor inteiro N
         * e depois N números inteiros. Ao final, mostra
         * a soma dos N números lidos.
         */

        Scanner sc = new Scanner(System.in);
        int qtdDeNumeros;
        int numeroInformado;
        int somaDosNumeros = 0;

        System.out.println("Informe quantos números deseja somar: ");
        qtdDeNumeros = sc.nextInt();

        for (int i = 0; i < qtdDeNumeros; i++) {
            System.out.printf("Informe o %dº número: ", i+1);
            numeroInformado = sc.nextInt();
            somaDosNumeros += numeroInformado;
        }

        System.out.printf("SOMA DOS %d NÚMEROS: %d", qtdDeNumeros, somaDosNumeros);

        sc.close();
    }
}
