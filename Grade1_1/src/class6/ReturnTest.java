package class6;

public class ReturnTest {
	static int sum(int max) {
		int total = 0;
		for (int i = 1; i <= max; i++)
			total += i;
		return total;
	}

	public static void main(String[] args) {
		int result;
		result = ReturnTest.sum(10);
		System.out.println(result);	//55
	}
}


//메소드도 2종류(인스턴스 메소드 , 클래스 메소드(static)) 있음. 클래스 메소드는 개별 객체와 무관하게 실행이 되는것이고, 인스턴스 메소드는 개별 객체가 호출 개별 객체가 가지고 있는 데이터 값을 이용해서 메소드 실행 
//static 메소드이기 때문에 개별 객체 없이 이와 같은 방식으로 호출 가능