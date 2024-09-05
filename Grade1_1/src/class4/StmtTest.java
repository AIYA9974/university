package class4;

public class StmtTest {
	static int sum(int max) {
		int total = 0;
		for (int i = 1 ; i <= max; i++)	//반복문
			total += i;
		return total;
	}
	
	public static void main(String[] args) {
		int result;
		result = StmtTest.sum(10);
		System.out.println(result);	//55
	}
}

