package entities;

public class NaturalPerson extends TaxPayer{
	
	private Double healthExpend;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double yearIncome, Double healthExpend) {
		super(name, yearIncome);
		this.healthExpend = healthExpend;
	}

	public Double getHealthExpend() {
		return healthExpend;
	}

	public void setHealthExpend(Double healthExpend) {
		this.healthExpend = healthExpend;
	}

	@Override
	public Double getTaxPayed() {
		Double limit = 20000.00;
		Double tax = 0.0;
		
		if(super.getYearIncome() < limit && this.getHealthExpend() > 0.0) {
			tax = (super.getYearIncome() * 0.15) - (this.getHealthExpend() * 0.5);
		}else if(super.getYearIncome() >= limit && this.getHealthExpend() > 0.0) {
			tax = (super.getYearIncome() * 0.25) - (this.getHealthExpend() * 0.5);
		}else if(super.getYearIncome() < limit && this.getHealthExpend() == 0.0) {
			tax = (super.getYearIncome() * 0.15);
		}else if(super.getYearIncome() >= limit && this.getHealthExpend() == 0.0) {
			tax = (super.getYearIncome() * 0.25);
		}

		return tax;
	}
}
