package ua.lviv.lgs;

public class Circle {
	
	private double radius;		//радіус кола
	private double diameter;	//діаметр кола
	
	//конструктор без параметрів
	Circle() {
			
		radius = 1.0;
		diameter = 2 * radius;	
	}
		
	//спеціалізований конструктор з параметрами
	Circle(double Radius) {
			
		radius = Radius;
		diameter = 2 * radius;	
	}
	
	//метод для розрахунку довжини кола (метрів)
	double lengthCircle() {
			
		double length;		
		length = 2 * 3.14 * radius;
			
		return length;		
	}	
	
	//метод для розрахунку площі кола (кв. метрів)
	double squareCircle() {
			
		double square;		
		double r = diameter / 2;
		
		square = 3.14 * (r * r);
			
		return square;		
	}

	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}	
	
}
