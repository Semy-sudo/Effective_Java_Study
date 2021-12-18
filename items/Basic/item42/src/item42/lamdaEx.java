package item42;

import java.util.Comparator;

public class lamdaEx {

	public static void main(String[] args) {
		//Comparator 는 인테페이스며 그 구현을 익명클래스를 통해 만든다.
		
//		Comparator<Integer> comp = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1.compareTo(o2);
//			}
//		};	
//		System.out.println(comp.compare(2, 1));
		
		//람다로 바꾸면,
		//Comparator 는 메세드가 하나이기 때문에 메서드 명 추론 가능
		//유일한 메서드의 매개변수는 유일하므로 매개변수들의 타입도 추론할 수 있다.
		Comparator<Integer> comp = (o1,o2) -> (o1.compareTo(o2));
		System.out.println(comp.compare(2, 1));
		
	}

}
