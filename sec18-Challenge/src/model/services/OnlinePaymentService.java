package model.services;

public interface OnlinePaymentService {

	Double interestRate(Double amount, Integer months); // JUROS
	Double paymentFee(Double amount); // TAXA DE PAGAMENTO
	
}
