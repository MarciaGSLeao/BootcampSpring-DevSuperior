package applications;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program2_Accounts {

	public static void main(String[] args) {
		
//		Account acc1 = new Account(1001, "Márcia", 0.00);
//		acc1.deposit(1000.00);
//		System.out.println(acc1.getBalance());
//		acc1.withDraw(200.00);
//		System.out.println(acc1.getBalance());
//		System.out.println();
		
		Account acc2 = new SavingsAccount(1002, "Felipe", 1000.0, 0.01);
		System.out.println(acc2.getBalance());
		acc2.withDraw(200.00);
		System.out.println(acc2.getBalance());
		System.out.println();
		
		Account acc3 = new BusinessAcount(1003, "João", 1000.0, 0.01);
		System.out.println(acc3.getBalance());
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance());
		System.out.println();
		
		
	}
}
