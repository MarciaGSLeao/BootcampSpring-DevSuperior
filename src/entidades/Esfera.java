package entidades;

public class Esfera {
	
	// Inserir a palavra reservada "STATIC" nos permite chamar um método
	// da classe diretamente a partir da própria classe sem a necessidade
	// de instanciar um objeto da classe a qual desejo obter o método
	// na classe do programana principal.
	
	public static final double PI = Math.PI;
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4 * PI * raio * raio * raio / 3;
	}

}
