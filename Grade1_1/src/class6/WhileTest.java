package class6;

public class WhileTest {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.print(i++ + " ");
		}
		
		System.out.println("---------------");
		i = 0;
		int sum = 0;
		do {
			sum += i ;
			i++;
		}while(i<10);
		System.out.println(sum);	//45
		
		i = 0 ; 
		sum = 0;
		do sum += i; while(++i < 10);
		System.out.println(sum);	//45
		
		
	}
}
