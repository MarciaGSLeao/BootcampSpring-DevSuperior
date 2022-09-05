package sec04_EstruturasSequenciais;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		int idade = 31;
		System.out.println(idade);
		
		double altura = 1.58;
		System.out.println(altura);

		double peso = 66.896029;
		// o print f usando o %.2f%n significa usar apenas 2 casas decimais. 
		System.out.println(peso);
		System.out.printf("%.3f%n", peso);
		System.out.printf("%.2f%n", peso);
		// Caso queira alterar o separados de casa decimal para (.) basta usar:
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", peso);
	}

}
