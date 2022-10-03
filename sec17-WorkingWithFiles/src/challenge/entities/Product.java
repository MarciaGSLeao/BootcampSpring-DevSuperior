package challenge.entities;

public class Product {
	
	private String description;
	private Double price;
	private Integer qtd;
	
	public Product(String description, Double price, Integer qtd) {
		this.description = description;
		this.price = price;
		this.qtd = qtd;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getQtd() {
		return qtd;
	}
	
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}

	public Double total() {
		return price * qtd;
	}

}
