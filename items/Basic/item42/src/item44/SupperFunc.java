package item44;

import java.util.function.*;

//아무런 입력을 받지 않고, 값을 하나 반환하는 함수형 인터페이스
//자료를 '공급' 하는 공급자 역할
//외부로 데이터를 리턴해 주는 역할
public class SupperFunc {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "A String";
		System.out.println(supplier.get());
		
		BooleanSupplier boolsup = () -> true;
		System.out.println(boolsup.getAsBoolean());
		
		IntSupplier rollDice = () -> (int)(Math.random()*6);
		for(int i=0;i<6;i++) {
			System.out.println(rollDice.getAsInt());
		}
		
		int x = 4;
		IntSupplier intSupp = () -> x; //로컬변수에도 접근할 수 있다.
		System.out.println(intSupp.getAsInt());
	}

}
