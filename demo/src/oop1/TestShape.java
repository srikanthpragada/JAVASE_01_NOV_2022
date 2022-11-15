package oop1;

abstract class Shape {
     public abstract double area();
}

class Circle extends Shape {
	protected int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public double area() {
		return Math.PI * this.radius * this.radius;
	}
}

class Square extends Shape {
	protected int side;

	public Square(int side) {
		super();
		this.side = side;
	}

	public double area() {
		return this.side * this.side;
	}
}

class Rect extends Shape {
	protected int width, length;

	public Rect(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public double area() {
		return this.width * this.length;
	}
}

public class TestShape {

	public static void main(String[] args) {
		Shape s = new Circle(10);
		System.out.println(s.area());

		s = new Square(20);
		System.out.println(s.area());
		
		s = new Rect(20, 30);
		System.out.println(s.area());
	}

}
