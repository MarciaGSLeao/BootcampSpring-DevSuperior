package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Application {

	public static void main(String[] args) {
		
		AbstractShape circle = new Circle(Color.BLACK, 2.0);
		AbstractShape rect = new Rectangle(Color.WHITE, 3.0, 4.0);
	
		System.out.println("Circle color: " + circle.getColor());
		System.out.println("Circle area: " + String.format("%.2f", circle.area()));
		System.out.println("Rectangle color: " + rect.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", rect.area()));
	}
}
