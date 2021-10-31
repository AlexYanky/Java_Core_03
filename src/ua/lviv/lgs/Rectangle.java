package ua.lviv.lgs;

public class Rectangle {
	
	private double length;	//������� ������������
	private double width;	//������ ������������
	
	//����������� ��� ���������
	Rectangle() {
		
		length = 1.0;
		width = 1.0;	
	}
	
	//�������������� ����������� � �����������
	Rectangle(double Length, double Width) {
		
		length = Length;
		width = Width;	
	}

	//����� ��� ���������� ��������� ������������ (�����)
	double perimeterRectangle() {
		
		double perimeter;		
		perimeter = 2*length + 2*width;
		
		return perimeter;		
	}

	//����� ��� ���������� ����� ������������ (��. �����)
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
