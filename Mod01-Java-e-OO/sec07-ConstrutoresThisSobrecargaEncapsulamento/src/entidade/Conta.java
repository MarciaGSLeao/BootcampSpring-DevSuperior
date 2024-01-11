package entidade;

public class Conta {
	
	private Integer number;   // Número de Identificação da Conta Bancária
	private String holder;    // Nome do titular da Conta Bancária
	private Double balance;  // Saldo da Conta Bancária
	
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
		this.balance -= amount;
	}	

}
