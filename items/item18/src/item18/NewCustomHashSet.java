package item18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

//전달객체를 확장하는 클래스
public class NewCustomHashSet<E> extends ForwardingSet<E>{
	private int addCount = 0;
	public NewCustomHashSet(Set<E> s) {
		super(s);
	}
	
	//새로운 hashset의 add
	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		System.out.println("NewCustom - addAll():"+addCount);
		return super.addAll(c);
	}
	
	public int getAddCount() {
		return this.addCount;
	}

	public static void main(String[] args) {
		NewCustomHashSet<String> n = new NewCustomHashSet<>(new TreeSet<>());
		n.addAll(Arrays.asList("1","2","3"));
		System.out.println(n.getAddCount());
	}
}
