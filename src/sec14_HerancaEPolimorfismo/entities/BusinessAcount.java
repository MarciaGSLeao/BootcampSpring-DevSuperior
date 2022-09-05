package sec14_HerancaEPolimorfismo.entities;

public class BusinessAcount extends Account{
	
	private Double loanLimite;
	
	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimite) {
		super(number, holder, balance);
		this.loanLimite = loanLimite;
	}

	public Double getLoanLimite() {
		return loanLimite;
	}

	public void setLoanLimite(Double loanLimite) {
		this.loanLimite = loanLimite;
	}
	
	public void loan(Double amount) {
		if (amount <= loanLimite) {
			deposit(amount); 
		}
	}

	@Override
	public final void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}

	
	
	
}
