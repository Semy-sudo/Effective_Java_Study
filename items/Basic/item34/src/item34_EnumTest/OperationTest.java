package item34_EnumTest;

import java.util.Optional;

public class OperationTest {

	public static void main(String[] args) {
		double x = Double.parseDouble("2");
		double y = Double.parseDouble("4");
		for(Operation op : Operation.values()) {
			System.out.println(op.apply(x, y));
			System.out.println(op.inverse(op));//연산의 반대 연산을 반환하는 메소드
		}
		//fromString 메소드를 통해 해당 symbol 이 존재하는 상수인지 먼저 확인 가능
		Optional<Operation> op = Operation.fromString("+");
		System.out.println(op);
		
		
		

	}

}
