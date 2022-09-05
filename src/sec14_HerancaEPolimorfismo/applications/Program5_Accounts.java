package sec14_HerancaEPolimorfismo.applications;

import java.util.ArrayList;
import java.util.List;

import sec14_HerancaEPolimorfismo.entities.Account;
import sec14_HerancaEPolimorfismo.entities.BusinessAcount;
import sec14_HerancaEPolimorfismo.entities.SavingsAccount;

public class Program5_Accounts {
	
	public static void main(String[] args) {
		
		List<Account> listAccounts = new ArrayList<>();
		
		listAccounts.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		listAccounts.add(new BusinessAcount(1002, "Maria", 1000.0, 400.0));
		listAccounts.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		listAccounts.add(new BusinessAcount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account account : listAccounts) {
			sum += account.getBalance();
		}
		
		System.out.printf("SALDO GERAL: R$ %.2f", sum);
		System.out.println();

		for (Account account : listAccounts) {
			account.deposit(10.0);;
		}
		
		for (Account account : listAccounts) {
			System.out.printf("SALDO ATUALIZADO DA CONTA %d: R$ %.2f%n", account.getNumber() , account.getBalance());
		}
		
	}

}
