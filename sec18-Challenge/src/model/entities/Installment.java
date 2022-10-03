package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	Date dueDate;
	Double amount;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	public Installment() {
	}
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + String.format("%.2f", amount);
 	}
	
}
