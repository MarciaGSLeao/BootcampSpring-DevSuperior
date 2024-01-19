package exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

// TRABALHANDO COM VETORES
public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o total de idades que deseja somar: ");
		int qtdNumeros = sc.nextInt();
		double[] listaDeIdades = new double[qtdNumeros];
		double soma = 0;
		double mediaIdades;
		
		for(int i = 0; i < qtdNumeros; i++) {
			System.out.printf("Informe a %dª idade: ", i + 1);
			listaDeIdades[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < qtdNumeros; i++) {
			soma += listaDeIdades[i];
		}
		
		mediaIdades = soma/qtdNumeros;
		System.out.printf("Média: %.2f", mediaIdades);
		sc.close();
		
	}

}
