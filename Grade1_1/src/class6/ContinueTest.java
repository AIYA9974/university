package class6;

public class ContinueTest {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 1 ; i <= 10 ; i++) {
			if(i%2 == 0)
				continue;
			total += i;
		}
		System.out.println(total); // 25
		
		System.out.println("--------------------");
		
		int total2 = 0;
		int i = 0;
		while ( ++i <= 10) {

			if(i%2 == 0)
				continue;
			total2 += i;
		}
		System.out.println(total2);	// 25
		
		System.out.println("--------------------");
		
		String searchMe = "Greece urgently need cash";
		int max = searchMe.length();
		int numEs = 0;
		target: for (i = 0; i < max ; i++) {
			if (searchMe.charAt(i) != 'e')
				continue target;
			numEs++;
		}
		System.out.printf("Found %d e's in the string",numEs);
	}
}

