package entidade;

public class Triangulo {

    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo() {
    }

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calculaPerimetro(){
        return (ladoA + ladoB + ladoC) / 2.0;
    }
    public double calculaArea (){
        return Math.sqrt(calculaPerimetro()
               * (calculaPerimetro() - ladoA)
               * (calculaPerimetro() - ladoB)
               * (calculaPerimetro() - ladoC));
    }

    @Override
    public String toString() {
        return "Triangulo {" +
                "ladoA = " + ladoA +
                ", ladoB = " + ladoB +
                ", ladoC = " + ladoC +
                '}';
    }
}
