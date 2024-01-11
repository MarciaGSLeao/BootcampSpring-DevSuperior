package entidades;

public class Quadrado {
	/*
	EXEMPLO DE COMO CRIAR UM MÉTODO ESTÁTICO.
	A CLASSE QUE CHAMAR O MÉTODO 'area' VAI FAZER DA SEGUINTE FORMA:
		Quadrado.area(<valor_da_base>,<valor_da_altura>);
	*/
	public static double area(double base, double altura) {
		return base * altura;
	}
}
