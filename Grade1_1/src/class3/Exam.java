package class3;

public class Exam {
	static int sum(int max) { 	//파라메타
		int total = 0;		// 지역변수
		for(int i = 1; i <= max; i++)
			total += i;
		return total;
	}
	
	public static void main(String[] args) {
		int result;			//지역변수
		result = Exam.sum(10);
		System.out.println(result);
	}
}
