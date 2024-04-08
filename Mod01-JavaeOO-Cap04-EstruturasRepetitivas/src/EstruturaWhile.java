import java.util.Scanner;

public class EstruturaWhile {
    /*
    *  Fazer um programa que lê números inteiros até que um zero seja lido.
    *  Ao final mostra a soma dos números lidos.
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numLido;
        int somaNumeros = 0;

        System.out.println("Informe um número: ");
        numLido = entrada.nextInt();

        while (numLido != 0){
            somaNumeros += numLido;
            System.out.println("Informe um número: ");
            numLido = entrada.nextInt();
        }

        System.out.printf("SOMA DOS NÚMEROS INFORMADOS = %d", somaNumeros);

        entrada.close();

    }
}
