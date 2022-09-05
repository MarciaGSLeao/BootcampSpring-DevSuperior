package sec04_EstruturasSequenciais;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = entrada.next();
		
		System.out.print("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.print("Informe sua altura: ");
		double altura = entrada.nextDouble();
	
//		System.out.printf("A %s tem %d anos e de altura", nome, idade);
		System.out.println(nome);
		System.out.println(idade);
		System.out.printf("%.2f%n", altura);
		
		entrada.close();
	}
}
