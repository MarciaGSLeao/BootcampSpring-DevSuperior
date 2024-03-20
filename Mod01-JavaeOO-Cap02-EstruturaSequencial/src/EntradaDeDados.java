import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

    // Utilizando o tipo Scanner para receber dados no Java.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;

        nome = entrada.next();
        idade = entrada.nextInt();
        salario = entrada.nextDouble();
        sexo = entrada.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);

        entrada.close();

    }
}
