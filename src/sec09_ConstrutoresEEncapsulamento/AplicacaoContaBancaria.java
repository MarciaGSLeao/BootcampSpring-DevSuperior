package sec09_ConstrutoresEEncapsulamento;

//import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBancaria;

public class AplicacaoContaBancaria {
	
	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;
		
		System.out.print("Informe o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o nome do titular da conta: ");
		String nomeTitular = sc.next();
		System.out.print("Deseja realizar um depósito inicial (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') {
			System.out.print("Qual o valor do depósito inicial? ");
			double depositoInicial = sc.nextDouble();
			conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);			
		}else {
			conta = new ContaBancaria(numeroConta, nomeTitular);
		}
		
		System.out.println();
		System.out.println(conta.toString());
		
		System.out.println("\nDeseja realizar alguma operação?\n1 - Depósito \n2 - Saque ");
		int resposta2 = sc.nextInt();
		
		if (resposta2 == 1) {
			System.out.print("\nQual o valor do depósito?");
			double deposito = sc.nextDouble();
			conta.Depositar(deposito);
		}else if (resposta2 == 2) {
			System.out.println("\nQual o valor do saque?");
			double saque = sc.nextDouble();
			conta.Sacar(saque);
		}
		
		System.out.println("");
		System.out.println(conta);
		
		sc.close();
	}
}
