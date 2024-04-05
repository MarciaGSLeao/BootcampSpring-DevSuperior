import java.util.Scanner;

public class OperadoresCumulativos {

    /*
    * Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito
    * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
    * custa R$ 2,00.
    * Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,
    * daí mostrar o valor a ser pago.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco = 50.0;
        int totalMinutos;
        int minutosExcedido;

        System.out.println("Informe a quantidade de minutos: ");
        totalMinutos = sc.nextInt();

        if (totalMinutos <= 100){
            System.out.println("VALOR A PAGAR: R$ 50,00");
        }else{
            minutosExcedido = totalMinutos - 100;
            preco += (2 * minutosExcedido);
            // Acima está um operador cumulativo. Poderia ser escrito assim:
            // preco = preco + (2 * minutosExcedido);
            System.out.printf("VALOR A PAGAR: R$ %.2f", preco);
        }

        sc.close();

    }
}
