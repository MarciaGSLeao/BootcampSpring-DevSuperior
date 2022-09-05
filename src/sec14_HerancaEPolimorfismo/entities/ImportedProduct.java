package sec14_HerancaEPolimorfismo.entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}
	
	public Double getPrice() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String getPriceTag() {
		return super.getName() 
				+ " R$ " 
				+ String.format("%.2f", getPrice())
				+ " (Taxa de Importação: R$ "
				+ String.format("%.2f", getCustomsFee())
				+ ")";
	}
}
