package item44;

import java.util.function.BinaryOperator;
import java.util.function.IntFunction;

public class TestLamda {

	public static void main(String[] args) {
		//1. Runnable - 람다
		Runnable runnable = () -> System.out.println("running!!!");//람다로 구현
		runnable.run();
		
		//2. Runnable - 함수형 인터페이스
		Runnable runnable2 = new Runnable(){
			@Override
			public void run() {
				System.out.println("running2!!!");
			};
		};
		runnable2.run();
		
		//람다가 훨씬 더 간결하게 구현되는 것을 확인할 수 있다.
		
		//java.function 사용해보기
		//int 값을 매개변수로 받아 함수를 생성
		IntFunction intSum = (a) -> a+10;
		System.out.println(intSum.apply(5));
		
		//동일한 타입의 두 값을 받아 연산을 처리
		BinaryOperator binarySum = (a,b) -> a + " "+b;
		System.out.println(binarySum.apply(1, 2));
		

	}

}
