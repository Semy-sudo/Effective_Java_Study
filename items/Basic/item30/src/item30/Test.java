package item30;

import java.util.*;
import java.util.function.UnaryOperator;


public class Test<? extends List> {
	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;
	
	//항등함수란 입력 값을 수정 없이 그대로 반환하는 함
	@SuppressWarnings("unchecked")
	private static UnaryOperator<Object> identityFunction(){
		return (UnaryOperator<T>) IDENTITY_FN;
	}
	
//	//입력 2개 , 반환 타입이 모두 같아야 함
//	public static<E> Set<E> union(Set<E> s1, Set<E> s2){
//		Set<E> result = new HashSet<>(s1);
//		result.addAll(s2);
//		return result;
//	}
	
	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if(c.isEmpty())
			throw new IllegalArgumentException("컬렉션이 비어 있습니다.");
		
		E result = null;
		for(E e: c)
			if(result == null || e.compareTo(result) > 0)
				result = Objects.requireNonNull(e);
		
		return result;
	}
	
	public static void main(String[] args) {
		Stack<Number> st = new Stack<>();
		Collection<Object> obj = new Collection<>();
		st.popAll(obj);
		Number n = new Number();
		Comparator com = new Comparator();
		Comparable com
		
	}
}
