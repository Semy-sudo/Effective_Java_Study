package item20;
//날수 있는을 상속받는 클래스는 전부 fly, flyMove 를 공통적으로 구현해야한다.
//단, 생명체 마다 fly, flyMove 때 수행하는게 일치하지 않을 수 있기때문에 인터페이스로 빼서 사용한다.
public interface Flyable {
	void fly(int yDistance);
	void flyMove(int xDistance, int yDistance);
	default void sing() {
		System.out.println("i am singing");
	};
}
