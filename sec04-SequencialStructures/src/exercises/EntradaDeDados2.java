package exercises;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// O .nextLine() permite a entrada de uma frase.
		String x = entrada.nextLine();
		String y = entrada.nextLine();
		String z = entrada.nextLine();
	
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		entrada.close();
	}
}
