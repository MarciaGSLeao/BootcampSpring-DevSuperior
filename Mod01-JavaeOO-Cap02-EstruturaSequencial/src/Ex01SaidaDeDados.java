public class Ex01SaidaDeDados {
/*
    Em um novo programa, inicie as variaveis abaixo:
    Modelo de saída:
        C:\Users\gamel\OneDrive\Documentos\Cursos\Java\Mod01-Java-e-OO\Mod01-JavaeOO-Cap02-EstruturaSequencial\imgs

    String product1 = "Computer";
    String product2 = "Office Desk";

    int age = 30;
    int code = 5290;
    char gender = 'F';

    double price1 = 2100.0;
    double price2 = 650.50;
    double price3 = 53.234567;
*/
    public static void main(String[] args) {

        String product1 = "Computador";
        String product2 = "Mesa de Escritório";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double price3 = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%n%s - Preço: R$ %.2f%n", product1, price1);
        System.out.printf("%s - Preço: R$ %.2f%n", product2, price2);

        System.out.printf("Registro: %d anos, código %d, sexo: %s", age, code, gender);

    }
}
