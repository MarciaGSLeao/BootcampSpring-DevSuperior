package entidades;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double valorLiquidoDolar (double cotacao, double qtdDolar) {
		return qtdDolar * (1 + IOF) * cotacao;
	}

}
