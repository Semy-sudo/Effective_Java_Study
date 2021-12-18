package item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class InstrumentedHashSet<E> extends HashSet<E>{

	private int addCount = 0;//추가된 원소의 수
	public InstrumentedHashSet() {}
	public InstrumentedHashSet(int initCap, float loadFactor) {
		super(initCap, loadFactor);
	}
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		System.out.println(addCount);//3
		return super.addAll(c);//hashset 이 addall 을 내부적으로 add를 이용해 구현한데 문제가 있음
	}
	
	public int getAddCount() {
		return addCount;
	}
	
	public static void main(String[] args) {
		InstrumentedHashSet<String> s = new InstrumentedHashSet();
		s.addAll(List.of("11","ddd","ddddd"));
		System.out.println(s.getAddCount());//6
	}
}
