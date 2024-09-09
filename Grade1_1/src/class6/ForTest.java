package class6;

public class ForTest {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100;i++) {
			total += i;
			System.out.printf("1부터 %d까지의 합은 %d입니다.%n",i,total);
		}
	}
}
