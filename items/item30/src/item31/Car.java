package item31;

import java.util.*;
import java.util.Objects;

public class Car<E> {
	List<E> carlist;

	public Car(List<E> carlist) {
		carlist = new ArrayList<>();
	}

	//현재 클래스의 타입인 E 와, E 를 상속한 값이 들어와야 E 타입으로 두고 max 를 선택할 수 있다.
	//즉 매개변수가 생성자의 역할을 하기 때문에
	public static <E extends Comparable<? super E>> E max(List<? extends E> c) {
		if (c.isEmpty()) {
			throw new IllegalArgumentException("collection is empty");
		}
		E result = null;
		for (E e : c) { // c 는 E를 생성함
			if (result == null || e.compareTo(result) > 0) {
				result = Objects.requireNonNull(e);
			}
		}
		
		return result;
	}

}
