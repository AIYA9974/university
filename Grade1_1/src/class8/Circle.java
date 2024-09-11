package class8;

public class Circle {
	int x,y;
	int radius;
	private static int count;
	public Circle() {
		this.radius = 0;
		Circle.count++;
	}
	
	public Circle(int a) {
		radius = a;
		count++;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static int getCount() {
		return count;
	}
}

