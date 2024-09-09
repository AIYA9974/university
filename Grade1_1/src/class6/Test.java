package class6;

public class Test {
	public static void main(String[] args) {
		for(int i = 0 , total = 0 ; i <= 10 ; i++) {	//55
			total += i;
			System.out.println("total 1 = "+total);
		}
		
		System.out.println("-----------------");
		
		for(int i = 0 , total = 0 ; i <= 10 ; total += i , i++ ) {	//45
			System.out.println("total 2 = "+total);
		} 
		
		System.out.println("-----------------");
		
		for(int i = 0 , total = 0 ; i <= 10 ; i++ , total += i ) {	//55
			System.out.println("total 3 = "+total);
		} 
	}
}


