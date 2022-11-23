package application;

import java.util.Scanner;

import model.services.PrintService;

public class Program01 {

	// FAÇA UM PROGRAMA QUE LEIA UMA QUANTIDADE N, E DEPOIS N NÚMEROS INTEIROS.
	// IMPRIMA ESSES NÚMEROS DE FORMA ORGANIZADA. EM SEGUIDA, INFORMAR QUAL FOI
	// O PRIMEIRO VALOR INFORMADO.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintService<String> psNames = new PrintService<>();
		PrintService<Integer> psNumbers = new PrintService<>();
		
		System.out.print("Informe a quantidade de nomes para armazenar? ");
		int totalNames = sc.nextInt();
		
		for(int p = 0; p < totalNames; p++ ) {
			String name = sc.next();
			psNames.addValue(name);
		}
		
		System.out.print("\nAgora informe a quantidade de idades para armazenar? ");
		int totalNumbers = sc.nextInt();
		
		for(int p = 0; p < totalNumbers; p++ ) {
			Integer age = sc.nextInt();
			psNumbers.addValue(age);
		}
		
		psNames.print();
		psNumbers.print();
		
		sc.close();
	}
}
