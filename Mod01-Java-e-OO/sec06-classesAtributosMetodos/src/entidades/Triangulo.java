package entidades;

public class Triangulo {
	
	// ATRIBUTOS
	private double ladoA;
	private double ladoB;
	private double ladoC;

	// CONSTRUTOR SEM PARÂMETRO
	public Triangulo() {
	}

	// CONSTRUTOR COM PARÂMETRO
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	// IMPLEMENTAR UM MÉTODO PARA CALCULAR O PERÍMETRO
	public double calcPerimetro(){
		return (ladoA + ladoB + ladoC) / 2;
	}
	
	// IMPLEMENTAR UM MÉTODO PARA CALCULAR A ÁREA
	public double calcArea(){
		return Math.sqrt(calcPerimetro() 
				         * (calcPerimetro() - ladoA)
				         * (calcPerimetro() - ladoB)
				         * (calcPerimetro() - ladoC));
	}
	
}
