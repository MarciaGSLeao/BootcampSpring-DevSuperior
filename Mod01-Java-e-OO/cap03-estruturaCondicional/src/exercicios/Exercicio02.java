package exercicios;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		// EXPRESSAO CONDICIONAL TERNARIA
		
		double preco = 100.90;
		double desconto = (preco < 20.0) ? preco*0.05 : preco*0.1 ;
		
		System.err.printf("Desconto: R$ %.2f", desconto);
		
	}

}
