package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.Paypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("DADOS DO CONTRATO");
		System.out.print("Nº do Contrato: ");
		Integer number = sc.nextInt();
		System.out.print("Data do contrato: ");
		Date date = sdf.parse(sc.next());
		System.out.print("Valor do Contrato: ");
		Double totalValue = sc.nextDouble();
		
		
		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Informe o número de parcelas: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new Paypal());
		
		contractService.processContract(contract, n);
		
		System.out.println("PARCELAS:");
		for (Installment p : contract.getInstallments()) {
			System.out.println(p);
		}
		
		sc.close();
	}
}
