package class6;

public class BreakTest {
	public static void main(String[] args) {
		int[] numbers = {14,27,31,5,12,99,2};
		int searchfor = 27;
		boolean found = false;
		
		for(int i : numbers) {
			found = true;
			break;
		}
	if (found)
		System.out.println("Found " + searchfor);	//Foun 27
	else
		System.out.println(searchfor + " not found");	
	}
}

