package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();			//конструктор без параметрів
		Rectangle rect2 = new Rectangle(3.2, 10.5);	//спеціалізований конструктор
		
		System.out.println("Прямокутник rect1:");
		System.out.println("довжина = " + rect1.getLength() + " M");
		System.out.println("ширина = " + rect1.getWidth() + " M");
		System.out.println();
		
		System.out.println("Периметр прямокутника rect1 = " + rect1.perimeterRectangle() + " M");
		System.out.println("Площа прямокутника rect1 = " + rect1.squareRectangle() + " M кв.");
		
		System.out.println();
		
		System.out.println("Прямокутник rect2:");
		System.out.println("довжина = " + rect2.getLength() + " M");
		System.out.println("ширина = " + rect2.getWidth() + " M");
		System.out.println();
		
		System.out.println("Периметр прямокутника rect2 = " + rect2.perimeterRectangle() + " M");
		System.out.println("Площа прямокутника rect2 = " + rect2.squareRectangle() + " M кв.");
		
		System.out.println();
		System.out.println("*************************************************");
		
		
		Circle circle1 = new Circle();		//конструктор без параметрів
		Circle circle2 = new Circle(3.2);	//спеціалізований конструктор
		
		System.out.println("Коло circle1:");
		System.out.println("радіус = " + circle1.getRadius() + " M");
		System.out.println("розрахований діаметр = " + circle1.getDiameter() + " M");
		System.out.println();
		
		System.out.println("Довжина кола circle1 = " + circle1.lengthCircle() + " M");
		System.out.println("Площа кола circle1 = " + circle1.squareCircle() + " M кв.");
		
		System.out.println();
		
		System.out.println("Коло circle2:");
		System.out.println("радіус = " + circle2.getRadius() + " M");
		System.out.println("розрахований діаметр = " + circle2.getDiameter() + " M");
		System.out.println();
		
		System.out.println("Довжина кола circle2 = " + circle2.lengthCircle() + " M");
		System.out.println("Площа кола circle2 = " + circle2.squareCircle() + " M кв.");
		
	}

}
