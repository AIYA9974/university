package class6;

public class BreakTest2 {
	public static void main(String[] args) {
		int[][] numbers = { { 14, 27, 31 }, { 5, 12 }, { 99, 2 } };
		int searchfor = 27;
		boolean found = false;
		int i,j = 0;
		outer:	//레이블!!
		for (i = 0; i < numbers.length; i++) {
			for (j = 0; j<numbers[i].length;j++) {
				if(numbers[i][j] == searchfor) {
					found = true;
					break outer;
				}
			}
		}
		if(found)
			System.out.println("Found "+searchfor + " at " + i +", " + j);	//Found 27 at 0, 1
		else
			System.out.println(searchfor + " not found");
	}
}

