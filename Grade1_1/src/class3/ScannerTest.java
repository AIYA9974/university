package class3;

public class ScannerTest {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("정수 2개를 입력하세요");
		int i = s.nextInt()	;
		int j = s.nextInt();
		System.out.println("두 수의 함은 " + (i+j) +"입니다");
	}
	
}
