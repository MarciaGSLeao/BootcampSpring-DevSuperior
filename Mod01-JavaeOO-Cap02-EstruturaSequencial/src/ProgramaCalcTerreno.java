import java.util.Scanner;

public class ProgramaCalcTerreno {

    public static void main(String[] args) {

        double largura;
        double comprimento;
        double precom2;
        double area;
        double precoTerreno;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do m² do terreno: ");
        precom2 = sc.nextDouble();

        area = largura * comprimento;
        System.out.printf("Área do terreno: %.2f%n", area);

        precoTerreno = precom2 * area;
        System.out.printf("Preço do terreno: R$ %.2f%n", precoTerreno);

        sc.close();

    }
}
