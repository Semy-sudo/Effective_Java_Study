package item44;
import java.util.function.*;

public class FunctionFunc {

	public static void main(String[] args) {
		Function<String, Integer> func = (s) -> s.length();
		System.out.println(func.apply("Strings"));
		
		//Bi가 붙으면 입력을 2개 받을 수 있다는 의미이다.
		BiFunction<String, String, Integer> biFunction = (s,u) -> s.length() + u.length();
		System.out.println(biFunction.apply("one", "two"));
		

	}

}
