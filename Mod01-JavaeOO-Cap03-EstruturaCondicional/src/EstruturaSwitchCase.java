import java.util.Scanner;

public class EstruturaSwitchCase {
/*
*    Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável.
*    Ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.
* */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int diaDaSemana;

        System.out.println("Informe o número que representa o dia da semana: " +
                "\n1 - DOMINGO" +
                "\n2 - SEGUNDA-FEIRA" +
                "\n3 - TERÇA-FEIRA" +
                "\n4 - QUARTA-FEIRA" +
                "\n5 - QUINTA-FEIRA" +
                "\n6 - SEXTA-FEIRA" +
                "\n7 - SÁBADO");
        diaDaSemana = scanner.nextInt();

        switch (diaDaSemana){
            case 1:
                System.out.println("Hoje é DOMINGO!");
                break;
            case 2:
                System.out.println("Hoje é SEGUNDA!");
                break;
            case 3:
                System.out.println("Hoje é TERÇA!");
                break;
            case 4:
                System.out.println("Hoje é QUARTA!");
                break;
            case 5:
                System.out.println("Hoje é QUINTA!");
                break;
            case 6:
                System.out.println("Hoje é SEXTA!");
                break;
            case 7:
                System.out.println("Hoje é SÁBADO!");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
