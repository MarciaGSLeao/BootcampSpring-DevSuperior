package app;

import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		
		/*
		 * FAZER O PROGRAMA PARA REALIZAR O CÁLCULO DA TRANSAÇÃO BANCÁRIA
		 * O modelo de exemplo encontra-se no link abaixo na página 15.
		 * https://drive.google.com/drive/folders/1LHRduSnnNzKAPyI74FuWmsBttEzA1R2b
		 * APÓS EXERCÍCIO FINALIZADO, INICIAR SEÇÃO 8 DO MÓDULO JAVA-OO.
		 */
		
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta(0,"");
		
		System.out.println("Informe o número da conta: ");
		conta.setNumber(sc.nextInt());
		System.out.println("Informe o nome do titular da conta: ");
		sc.nextLine();
		conta.setHolder(sc.nextLine());
		
		System.out.println("Haverá depósito inicial (s/n)?");
		String confirmacao = sc.nextLine();
		confirmacao = confirmacao.toLowerCase();
		char opcao = confirmacao.charAt(0);
		
		if (opcao == 's'){
			System.out.print("Informe o valor do depósito inicial:");
			conta.setBalance(sc.nextDouble());
			System.out.println("\nDADOS DA CONTA:" + conta);
		}

		System.out.println("Informe um valor para depósito: ");
		conta.deposit(sc.nextDouble());
		System.out.println("\nDADOS DA CONTA:" + conta);

		System.out.println("Informe um valor para saque: ");
		conta.withdraw(sc.nextDouble());
		System.out.println("\nDADOS DA CONTA:" + conta);

		sc.close();
	}
}
