package sec05_EstruturasCondicionais;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	
	public static void main(String[] args) {
		// (condição) ? valor_se_verdadeiro : valor_se_falso
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Informe o preço do produto: ");
		double preco = entrada.nextInt();
		double desconto = (preco <= 100) ? preco * 0.1 : preco * 0.2;
		
		System.out.printf("Seu desconto é de R$ %.2f", desconto);
		
		
		
				
		entrada.close();
		
	}
}
