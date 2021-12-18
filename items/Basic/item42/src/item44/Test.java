package item44;

import java.util.LinkedHashMap;
import java.util.Map;


public class Test {

	public static void main(String[] args) {
		int maxSize = 10;
		LambdaLinkedHashMap fixedLinkedHashMap = new LambdaLinkedHashMap((map,eldest) -> map.size() > maxSize); //1. 생성자 통해 람다 정의
		
	}
	

	static class LambdaLinkedHashMap extends LinkedHashMap<String, Integer>{
		private EldestEntryRemovalFunction<Integer, String> removalFunction;
		
		LambdaLinkedHashMap(EldestEntryRemovalFunction<Integer, String>  removalFunction){
			this.removalFunction = removalFunction; // 생성자를 통해 값을 지정
		}
		

		@Override
		protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
			return removalFunction.remove(this, eldest); // 현재 사이즈가 초과되면, true 
		} 
	}
	
	@FunctionalInterface
	interface EldestEntryRemovalFunction<K,V> {
		boolean remove(Map<K,V> map, Map.Entry<K, V> eldest);
	}

}
