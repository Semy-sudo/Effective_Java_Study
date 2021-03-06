package item45;

import java.util.function.IntBinaryOperator;

public class Main {

	public static void main(String[] args) {
		//functional interface 사용법
		IntBinaryOperator operator;
		
		//1. 정적 메소드 참조
		operator = (x,y) -> x+y;
		System.out.println(operator.applyAsInt(3, 6));
		
		//2. 인스턴스 메소드 참조
		Calculator cal = new Calculator();
		operator = cal::InstanceSum;
		System.out.println(operator.applyAsInt(5, 6));
		

		//3. 데카르트 곱
		List<Card>
	}
	
	

}
