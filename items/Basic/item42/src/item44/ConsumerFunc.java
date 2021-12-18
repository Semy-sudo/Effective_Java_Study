package item44;

import java.util.function.*;

public class ConsumerFunc {

	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("A string...");
		
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t+" "+u);
		biConsumer.accept("Hello", "World");
		
		//오토박싱, 언박싱을 사용하면 비효울적이다.
		Consumer<Integer> integerConsumer = (x) -> System.out.println(x);
		integerConsumer.accept(10);//값이 들어갈 땐 오토박싱 출력할 때 언박싱

		//최적화를 위해 별도로 만든것이라는데...
		IntConsumer intConsumer = (x) -> System.out.println(x);
		intConsumer.accept(5);
		
		//t는 <>안에 값 x는 objIntconsumer 의 int 의 자료형이 들어간다.
		ObjIntConsumer<String> objIntConsumer = (t,x) -> System.out.println(t +" :" +x);
		objIntConsumer.accept("x", 1024);
	}

}
