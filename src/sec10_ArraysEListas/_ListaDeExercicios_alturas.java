package sec10_ArraysEListas;

import java.util.Scanner;

public class _ListaDeExercicios_alturas {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão cadastradas? ");
		int nPessoas = sc.nextInt();
		
		String[] nomes = new String[nPessoas];
		int[] idades = new int[nPessoas];
		double[] alturas = new double[nPessoas];
		
		for (int i=0; i < nPessoas; i++) {
			System.out.printf("Dados da %dª pessoa: \n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();		
		}
		
		double somaAlturas = 0;
		for (int i=0; i < nPessoas; i++) {
			somaAlturas += alturas[i];
		}
		
		double mediaAlturas = somaAlturas / (double)nPessoas;
		System.out.printf("\nAltura média = %.1f%n", mediaAlturas);
		
		int totalDeMenores = 0;
		for (int i=0; i < idades.length; i++) {
			if (idades[i] < 16) {
				totalDeMenores = totalDeMenores + 1;
			}
		}
		
		double percentualDeMenores = ((double)totalDeMenores/(double)nPessoas) * 100;
		System.out.printf("Pessoas com menos de 16 anos = %.1f%%%n", percentualDeMenores);
		for (int i=0; i<nomes.length; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
