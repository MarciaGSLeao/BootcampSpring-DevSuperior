package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_maisVelho {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai cadastrar? ");
		int n = sc.nextInt();
		String[] nomes = new String[n];
		Integer[] idades = new Integer[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %dª pessoa: %n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();			
		}
		
		int maiorIdade = 0;
		String maisVelho = "";
		for(int i=0; i<idades.length; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				maisVelho = nomes[i];
			}
			
		}
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		
		sc.close();
	}
}
