package class4;

public class OpTest {
	public static void main(String[] args) {
		boolean c = false;
		System.out.println(!c && c);	//false
		
		System.out.println(3/2);	//1
		System.out.println(3/2.0);	//1.5
		
		int i =3 , j;
		System.out.println(j=5);	//5
		System.out.println(i++);	//3
		System.out.println(++j);	//6
		System.out.println( (i>=j) ? i : j ); //(i>=j) => false 즉 j 값인 6
		
		int a = 0b0011_1100;	//십진수 60
		int b = 0b0000_1101;	//십진수 13
		System.out.println(a^b);	// 0011_0001 = 49
		System.out.println(a&b);	// 0000_1100 = 12
		System.out.println(~a);		// 1100_0011 = -61
		System.out.println(a<<2);	// 1111_0000 = 240
		System.out.println(a>>2);	// 0000_1111 = 15
		System.out.println(a>>>2);	// 0000_1111 = 15
	}
}

