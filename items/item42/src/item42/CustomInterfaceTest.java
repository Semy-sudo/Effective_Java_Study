package item42;

public class CustomInterfaceTest {

	public static void main(String[] args) {
		CustomInterface<String> in = () -> "Hello Custom!";
		
		String s = in.myCall();
		System.out.println(s);
		
		in.printDefault();
		
		CustomInterface.printStatic();

	}

}
