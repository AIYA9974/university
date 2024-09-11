package class8;

public class OverloadTest {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println(mc.add(10, 15));	//25
		System.out.println(mc.add(10.5, 15.3));	//25.8
		System.out.println(mc.add(10, 10.5));	//20.5
		System.out.println(mc.add("Java", "Language"));	//JavaLanguage
	}
}

