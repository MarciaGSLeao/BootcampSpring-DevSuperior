package sec14_HerancaEPolimorfismo.applications;

import sec14_HerancaEPolimorfismo.entities.Account;
import sec14_HerancaEPolimorfismo.entities.BusinessAcount;
import sec14_HerancaEPolimorfismo.entities.SavingsAccount;

public class Program1 {
	
	public static void main(String[] args) {
		
		//Account acc = new Account(1001, "Márcia", 0.0);
		//BusinessAcount bAcc = new BusinessAcount(1002, "João", 0.0, 1000.0);
		
		// UPCASTING => é o casting da subclasse para um objeto da superclasse.
		
		//Account acc1 = bAcc;
		Account acc2 = new BusinessAcount(1003, "Felipe", 10.0, 5000.00);		
		Account acc3 = new SavingsAccount(1003, "Felipe", 10.0, 0.1);		

		// DOWNCASTING...
		
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(200.00);
		
		// BusinessAcount acc5 = acc3;
		if(acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan granted!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
		
	}
	
}
