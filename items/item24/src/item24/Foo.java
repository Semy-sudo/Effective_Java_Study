package item24;

import java.util.LinkedList;
import java.util.Queue;

public class Foo {
	private int foo;
	
	public Foo(int foo) {
		this.foo = foo;
	}
	
	public int getFoo() {
		return foo;
	}
	
	//비정적 멤버 클래스인 Bar
	public class Bar{
		private int bar;
		
		public Bar(int bar) {
			this.bar = bar;
		}
		
		public int getBar() {
			return bar;
		}
		
		public void aToVal() {
			Foo.this.foo = bar;//바깥 인스턴스의 숨은 외부 참조
		}
	}
	
	//정적 멤버 클래스라면
	public static class Car{
		
		private int car;
		
		public Car(int car) {
			this.car = car;
		}
		
		public int getCar() {
			return car;
		}
		
		public void aToVal() {
			
		}
	}
	
	public static void main(String[] args) {
		Queue<Car> q = new LinkedList<>();
		q.add(new Car(10));
		Queue<Bar> q2 = new LinkedList<>();
		//q2.add(foo.new Bar(100)); //-> 혼자 생성될 수 없음
	}

}
