package item18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//전달 클래스 
public class ForwardingSet<E> implements Set<E> {
	private final Set<E> s;
	HashSet<Integer> set
	public ForwardingSet(Set<E> s) {
		this.s = s;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e) {
		return s.add(e);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	//상위클래스인 HashSet 에서는 allAll메서드 내부적으로 add() 메서드를 호출하는것으로 
	//구현되어있음. 따라서 addCount()호출 addCount++ -> add()호출 addCount++ 이기에
	//count가 2배가 됨.
	
	//HashSet의 내부 구현에 해당하며 문서를 통해 소개되어 있지 않으면 체크하기 어려울것입니다.
	//따라서 그때마다 확인해서 수정하고, extends 해야하는 작업이 번거로울것입니다.
	@Override
	public boolean addAll(Collection<? extends E> c) {
		System.out.println("Forwarding - addAll():"+c.size());
		return s.addAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
