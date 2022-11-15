package entities;

public class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final Double getPayment() {
		Double bonus = additionalCharge * 2.1; // 2.1 representa 110%. 
		return super.getPayment() + bonus;
		// return (super.getValuePerHour() * super.getHours()) + bonus;
	}
}
