package entidade;

public class Conta {
	
	private Integer number;   // Número de Identificação da Conta Bancária
	private String holder;    // Nome do titular da Conta Bancária
	private Double balance;  // Saldo da Conta Bancária

	private final Double taxaDeSaque = 5.00;
	
	public Conta(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	// DEPÓSITO
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// SAQUE
	public void withdraw(double amount) {
		this.balance -= (amount + taxaDeSaque);
	}

	@Override
	public String toString() {
		return " Conta {" +
				"Nº : " + number +
				", TITULAR : '" + holder + '\'' +
				", SALDO : " + String.format("%.2f", balance) +
				'}';
	}
}
