package sec06_EstruturasRepetitivas;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int x = entrada.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x; 
			System.out.print("Informe um número: ");
			x = entrada.nextInt();
		}
		
		System.out.println("A soma dos números informados3 é " + soma);
		
		entrada.close();
	}
}
