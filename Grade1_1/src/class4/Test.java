package class4;

public class Test {
	public static void main(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); //4
		++i;
		System.out.println(i); //5
		System.out.println(++i);//6
		System.out.println(i++); //6
		System.out.println(i); //7
		
		int x = 5, y = 10;
		System.out.println(++x*y--); 
				//60  => 6 * 10(후위 감소 연산자이기 때분에 연산중 y = 10, 연산후 y = 9)
	}
}


   