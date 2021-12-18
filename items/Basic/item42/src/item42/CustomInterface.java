package item42;
@FunctionalInterface
public interface CustomInterface<T> {
	
	T myCall();
	
	//default 메서드는 존재해도 상관없음
	default void printDefault() {
		System.out.println("Hello Default!");
	}
	
	//static 메서드는 존재해도 상관없음
	static void printStatic() {
		System.out.println("Hello Static!");
	}

}
