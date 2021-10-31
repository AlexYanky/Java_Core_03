package ua.lviv.lgs;

public class Circle {
	
	private double radius;		//����� ����
	private double diameter;	//������ ����
	
	//����������� ��� ���������
	Circle() {
			
		radius = 1.0;
		diameter = 2 * radius;	
	}
		
	//�������������� ����������� � �����������
	Circle(double Radius) {
			
		radius = Radius;
		diameter = 2 * radius;	
	}
	
	//����� ��� ���������� ������� ���� (�����)
	double lengthCircle() {
			
		double length;		
		length = 2 * 3.14 * radius;
			
		return length;		
	}	
	
	//����� ��� ���������� ����� ���� (��. �����)
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
