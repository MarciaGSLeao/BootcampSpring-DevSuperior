package exercicios;

import java.util.Scanner;

// ESTRUTURA REPETITIVA FOR              
public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números deseja somar? ");
		int qtdNums = sc.nextInt();
		int soma = 0;
		
		for (int i = 1; i <= qtdNums; i++) {
			System.out.printf("Informe o %dº número. %n", i);
			int num = sc.nextInt();
			soma += num;
		}
		
		System.out.printf("SOMA: %d", soma);
		sc.close();
		
	}

}
