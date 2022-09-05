package sec14_HerancaEPolimorfismo.entities;

public class LegalPerson extends TaxPayer{

	private int totalEmployees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double yearIncome, int totalEmployees) {
		super(name, yearIncome);
		this.totalEmployees = totalEmployees;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	@Override
	public Double getTaxPayed() {
		Double tax = 0.0;
		if(totalEmployees > 10) {
			tax = super.getYearIncome() * 0.14;
		}else {
			tax = super.getYearIncome() * 0.16;
		}
		return tax;
	}
	
}
