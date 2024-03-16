public class Casting {

    public static void main(String[] args) {

        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado =  a / b;
        System.out.println("RESULTADO SEM CASTING: " + resultado);

        resultado = (double) a / b;
        System.out.println("RESULTADO COM CASTING: " + resultado);

    }
}
