package class3;

public class Circle {
	static final double PI = 3.14;
	private int radius;
	
	public Circle(int a) {
		this.radius = a;
	}

	int getRadius() {
		return this.radius;
	}

	void setRadius(int r) {
		this.radius = r;
	}
	
	public double getArea(){
		double temp;
		temp = this.radius * this.radius * PI;
		return temp;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(3);
		System.out.println(c.getArea());
		System.out.println(Circle.PI);
	}
	
}
