package class5;

public class DanglineElseTest {
	public static void main(String[] args) {
		int a = 2;
		int b = 2;
		if(a==1)
			if(b==2)
				System.out.println("a = 1 , b = 2");
		else
			System.out.println("a != 1");	//드려쓰기 잘못쓴 예=>
												//이 esle문은 아래의 b==2와 연결되어 있기때문에
												//a==1이 false여서 출력값이 없음
	}
}

