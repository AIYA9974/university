package class7;

public class VarargsTest {
	public static void doSomethings(String... strs) {
		System.out.print("Arguments are: ");
		for (String s : strs) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		doSomethings("Hello","world","again","and","again");
		doSomethings("Hello","world");
		
		String[] strs = {"apple","orange"};
		doSomethings(strs); 
	}
}

