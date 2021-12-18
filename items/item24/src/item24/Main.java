package item24;

import item24.Foo.*;

public class Main {

	public static void main(String[] args) {
		int num = 5;
		Foo foo = new Foo(num);
		System.out.println(foo.getFoo());

		//바깥클래스.비정적클래스
		//outer 클래스의 객체를 통해서 생성할 수 있다.
		Foo.Bar bar = foo.new Bar(10);
		bar.aToVal();
		
		System.out.println(foo.getFoo());//bar.aToVal 에 의해 변경된 10 이 출력
		//결론: 멤버클래스가 인스턴스화 될 때 바깥 클래스와 관계가 확립됨을 확인 -> 지양하는게 좋다.
		
		//외부 클래스의 객체 없어도 inner 클래스의 객체 생성이 가능하다
		Foo.Car carInstance = new Car(7);
		carInstance.getCar();
		
		HashMap<Inter>
		
		Integer i = 
		
		Set<Integer> set = 
		
	}

}
