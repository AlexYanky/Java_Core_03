package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle();			//����������� ��� ���������
		Rectangle rect2 = new Rectangle(3.2, 10.5);	//�������������� �����������
		
		System.out.println("����������� rect1:");
		System.out.println("������� = " + rect1.getLength() + " M");
		System.out.println("������ = " + rect1.getWidth() + " M");
		System.out.println();
		
		System.out.println("�������� ������������ rect1 = " + rect1.perimeterRectangle() + " M");
		System.out.println("����� ������������ rect1 = " + rect1.squareRectangle() + " M ��.");
		
		System.out.println();
		
		System.out.println("����������� rect2:");
		System.out.println("������� = " + rect2.getLength() + " M");
		System.out.println("������ = " + rect2.getWidth() + " M");
		System.out.println();
		
		System.out.println("�������� ������������ rect2 = " + rect2.perimeterRectangle() + " M");
		System.out.println("����� ������������ rect2 = " + rect2.squareRectangle() + " M ��.");
		
		System.out.println();
		System.out.println("*************************************************");
		
		
		Circle circle1 = new Circle();		//����������� ��� ���������
		Circle circle2 = new Circle(3.2);	//�������������� �����������
		
		System.out.println("���� circle1:");
		System.out.println("����� = " + circle1.getRadius() + " M");
		System.out.println("������������ ������ = " + circle1.getDiameter() + " M");
		System.out.println();
		
		System.out.println("������� ���� circle1 = " + circle1.lengthCircle() + " M");
		System.out.println("����� ���� circle1 = " + circle1.squareCircle() + " M ��.");
		
		System.out.println();
		
		System.out.println("���� circle2:");
		System.out.println("����� = " + circle2.getRadius() + " M");
		System.out.println("������������ ������ = " + circle2.getDiameter() + " M");
		System.out.println();
		
		System.out.println("������� ���� circle2 = " + circle2.lengthCircle() + " M");
		System.out.println("����� ���� circle2 = " + circle2.squareCircle() + " M ��.");
		
	}

}
