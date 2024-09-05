package class4;

import class3.Circle;

public class SimpleExpr {
	public static void main(String[] args) {
		int i = 1;
		int j = i + 1, k = 3;
		System.out.println("i+j = " + (i+j));  	//i+j = 3
		System.out.println(i / j / k); 	//i / j => 0 즉 0
		System.out.println(i = 5); 	//5
		System.out.println(i++); 	//5
		Circle c = new Circle(i);
		System.out.println("Hello World");	//Hello World
		System.out.println(c.getArea());	//113.04 (3번째 강의 Circle class 가져옴)
	}
}


