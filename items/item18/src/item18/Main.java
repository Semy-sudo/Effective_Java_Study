package item18;

public class Main {
	public static void main(String[] args) {
		Child ch = new Child();
//		ch.add();//Child 에서 재정의한 add 가 출력됨
//		Parent p = new Child();
//		p.add();//??? child 에서 재정의한 add가 출력됨
		ch.addAll();
	}
}
