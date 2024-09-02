package class2;

public class CircleTest {
	public static void main(String[] args) {
		Circle c = new Circle(2);
		System.out.println(c.getRadius());
		c.setRadius(10);
		System.out.println(c.getArea());
	}
}
