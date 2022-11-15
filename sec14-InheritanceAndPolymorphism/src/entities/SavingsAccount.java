package entities;

public final class SavingsAccount extends Account{
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double i, Double interestRate) {
		super(number, holder, i);
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withDraw(Double amount) {
		balance -= amount;
	}

}
