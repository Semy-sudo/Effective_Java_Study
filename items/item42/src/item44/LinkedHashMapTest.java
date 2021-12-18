package item44;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		int maxSize = 10;
		FixedLinkedHashMap fixedLinkedHashMap = new FixedLinkedHashMap(maxSize);
		
	}
	

	static class FixedLinkedHashMap extends LinkedHashMap<String, Integer>{
		final int maxSize;//유지해야 하는 가장 최근 원소 개수
		
		FixedLinkedHashMap(int maxSize){
			this.maxSize = maxSize; // 생성자를 통해 값을 지정
		}
		
		@Override
		protected boolean removeEldestEntry(java.util.Map.Entry<String, Integer> eldest) {
			return this.size() > maxSize; // 현재 사이즈가 초과되면, true 
		} 
	}
	
}
