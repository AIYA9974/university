package class6;

public class NestedForTest {
	public static void main(String[] args) {
		int i , j;
		for(i = 2; i <= 6; i+=2) {
			for (j = 1; j <= 3; j++) {
				System.out.printf("%d*%d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}
	}
}
