package sec14_HerancaEPolimorfismo.entities;

import sec14_HerancaEPolimorfismo.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// Os métodos abstratos são métodos que não possuem
	// corpo, ou seja, não se usa chaves. Se um método for definido como abstrato,
	// a classe também deve ser definida como abstratada.
	public abstract Double getArea();
}
