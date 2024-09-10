 package class7;

public class Circle {
	int x,y;
	int radius;
	static int count;
	
	public Circle() {
		this.radius = 0;
		Circle.count++;
	}
	
	public Circle(int a) {
		this.radius = a;
		Circle.count++;
	}
	
	public double getArea() {
		return this.radius * this.radius * 3.14;
	}
}

