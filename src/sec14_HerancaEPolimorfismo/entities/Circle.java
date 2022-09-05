package sec14_HerancaEPolimorfismo.entities;

import sec14_HerancaEPolimorfismo.enums.Color;

public class Circle extends Shape{
	
	private Double radius;
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double getArea() {
		return Math.PI * (radius * radius);
	}
	
}
