package class3;

public class SimpleFormat {
	public static void main(String[] args) {
		System.out.println("123456 123456 123456");
		System.out.println("------------------");
		System.out.printf("%6o %6d %6x %n", 20,20,20); //%,6자리,8진수 %,6자리,10진수  %,6자리,16진수 줄바꿈
		System.out.printf("%-6o %-6d %-6x %n", 20,20,20); //%,왼편에 붙여,6자리,8진수 %,왼편에 붙여,6자리,10진수  %,왼편에 붙여,6자리,16진수 줄바꿈
		System.out.printf("%1$6o %+6d %2$6h %n", 128,256);//%,첫번째인자에,6자리,8진수 %,+를붙여,6자리,10진수 %,두번째인자에,6자리,16진수로 변환
		System.out.printf("%1$6.2f %1$6.4f %1$8.6f %n", 3.141592);//%,첫번째인자에,전체6자리소숫점2자리,실수 %,첫번째인자에,전체6자리소숫점4자리,실수 %,첫번째인자에,전체8자리소숫점6자리,실수 
	}
}
