package ua.lviv.lgs;

public class Rectangle {
	
	private double length;	//довжина прямокутника
	private double width;	//ширина прямокутника
	
	//конструктор без параметрів
	Rectangle() {
		
		length = 1.0;
		width = 1.0;	
	}
	
	//спеціалізований конструктор з параметрами
	Rectangle(double Length, double Width) {
		
		length = Length;
		width = Width;	
	}

	//метод для розрахунку периметра прямокутника (метрів)
	double perimeterRectangle() {
		
		double perimeter;		
		perimeter = 2*length + 2*width;
		
		return perimeter;		
	}

	//метод для розрахунку площі прямокутника (кв. метрів)
	double squareRectangle() {
		
		double square;		
		square = length * width;
		
		return square;		
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
