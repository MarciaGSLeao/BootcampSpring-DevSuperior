package model.services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePayment;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuote = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = basicQuote * 0.01 * i;
			double paymentFee = (basicQuote + interest) * 0.02;
			double amountInstallment = basicQuote + interest + paymentFee;
			
			Installment installment = new Installment(dueDate, amountInstallment);
			contract.addInstallment(installment);
		}
		
	}
	
}
