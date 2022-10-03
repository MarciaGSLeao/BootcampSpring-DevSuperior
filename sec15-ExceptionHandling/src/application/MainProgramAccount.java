package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class MainProgramAccount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Informe os dados da conta:");
			System.out.print("Nº: ");
			Integer numberAccount = sc.nextInt();
			System.out.print("Titular: ");
			sc.next();
			String holder = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			Double balance = sc.nextDouble();
			System.out.print("Limite de Saque: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account acc = new Account(numberAccount, holder, balance, withdrawLimit);
			
			System.out.print("\nInforme a quantia do saque: ");
			Double amount = sc.nextDouble();
			try {
				acc.withdraw(amount);
			} catch (DomainException e) {
				System.out.println(e.getMessage());;
			}
			System.out.println("\nSaldo atualizado: R$ " + acc.getBalance());
		
		sc.close();
		
	}

}
