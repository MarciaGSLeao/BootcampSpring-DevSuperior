package app;

import entidade.Triangulo;

public class AplicacaoTriangulo {

    public static void main(String[] args) {

        Triangulo trianguloX = new Triangulo(3.0, 4.0, 5.0);
        Triangulo trianguloY = new Triangulo(7.5, 4.5, 4.02);

        //System.out.println(trianguloX.toString());
        System.out.printf("ÁreaX: %.2f%n", trianguloX.calculaArea());
        //System.out.println(trianguloY.toString());
        System.out.printf("ÁreaY: %.2f%n", trianguloY.calculaArea());

    }
}
