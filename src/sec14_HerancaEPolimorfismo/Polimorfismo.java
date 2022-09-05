package sec14_HerancaEPolimorfismo;

import sec14_HerancaEPolimorfismo.entities.Account;
import sec14_HerancaEPolimorfismo.entities.SavingsAccount;

public class Polimorfismo {
	
	public static void main(String[] args) {
		
		/* A CLASSE ACCOUNT FOI DEFINIDA COMO ABSTRACT.. POR ESSE MOTIVO
		 * OS OBJETOS INSTANCIADOS COMO NEW ACCOUNT CONSTAM COMO COMENTADOS
		 * APENAS PARA FINS DE TESTES.
		*/
		
//		Account x = new Account(1001, "Charlote", 1000.0);
		Account y = new SavingsAccount(1002, "Helena", 1000.0, 0.01);
		
//		System.out.println(x.toString());
//		x.withDraw(50.0);
//		System.out.println(x.getBalance());
		System.out.println();
		
		System.out.println(y.toString());
		y.withDraw(50.0);
		System.out.println(y.getBalance());
		System.out.println();
		
	}
	
}
