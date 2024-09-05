package class5;

public class CommandInputTest {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		switch (args[2]) {
			case ("+"):
				System.out.println("두 수의 합은 "+ (x+y)+ "입니다");
				break;
			case ("*"):
				System.out.println("두 수의 곱은 "+ (x+y)+ "입니다");
		}
	}
}



//Integer.parseInt => Integer클래스 안에 있는 parseInt라는 static 메소드
//						문자열은 int값으로 바꿔버리는 역할

