package class7;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2; c2 = new Circle();
		
		System.out.println(c1.radius);	//10
		c2.radius = 5;
		System.out.println(c2.getArea());	//78.5
		System.out.println(Circle.count );	//2
	}
}

