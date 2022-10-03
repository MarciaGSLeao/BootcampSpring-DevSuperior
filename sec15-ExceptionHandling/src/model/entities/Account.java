package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder; // titular
	private Double balance; // saldo
	private Double withdrawLimit; // limite de saque
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withDrawLimit;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(balance < 0 || amount > balance) 
			throw new DomainException("Você não possui saldo disponível para saque.");
		
		if(amount > withdrawLimit) 
			throw new DomainException("Valor de saque superior ao limite de saque.");
		
		balance -= amount;
	}

}
