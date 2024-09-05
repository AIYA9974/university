package class2;

public class Circle {
	private int radius;
	
	public Circle(int a) {
		this.radius = a;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return this.radius * this.radius * 3.14;
	}
}

