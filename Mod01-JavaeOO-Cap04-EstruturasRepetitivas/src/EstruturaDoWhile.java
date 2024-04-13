import java.util.Scanner;

public class EstruturaDoWhile {

    public static void main(String[] args) {
        /*
        *  Fazer um programa para ler uma temperatura em Celsius
        *  e mostrar o equivalente em Fahreinheit. Perguntar se
        *  o usuário deseja repetir(s/n). Caso o usuario digite "s",
        *  repetir o programa.
        *  Fórmula: F = (9C/5) + 32
        * */
        Scanner sc = new Scanner(System.in);

        double tempCelsius;
        double tempFahrenheit;
        char   escolha;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            tempCelsius = sc.nextDouble();
            tempFahrenheit = (9 * tempCelsius / 5) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempFahrenheit);
            System.out.print("Deseja repetir? ");
            escolha = sc.next().charAt(0);
            //System.out.println(escolha);
        }while (escolha == 's');

        sc.close();
    }
}
