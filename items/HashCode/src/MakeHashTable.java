import java.util.HashMap;
import java.util.LinkedList;

class HashTable{
	class Node{
		String key;
		String value;
		Node(String key,String value){
			this.key = key;
			this.value = value;
		}
		String value() {
			return value;
		}
		void value(String value) {
			this.value = value;
		}
	}
	LinkedList<Node>[] data;
	HashTable(int size) {
		this.data = new LinkedList[size];
	}
	//1. key -> hashcode = hash알고리즘
	//문자열을 돌면서 각 레터의 아스키 코드값을 가져와서 더해줌
	int getHashCode(String key) {
		int hashcode = 0;
		for(char ch: key.toCharArray()) {
			hashcode += ch;
		}
		return hashcode;
	}
	//2. hashcode -> index
	int convertToIndex(int hashcode) {
		return hashcode%data.length;
	}
	//3. 한 배열방에 노드가 여러개 존재할때 key를 이용하여 노드 찾음
	Node searchkey(LinkedList<Node> list, String key){
		if(list == null) return null;
		for(Node node: list) {
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
	}
	
	//
	void put(String key, String value) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		if(list==null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		Node node = searchkey(list,key);
		if(node==null) {
			list.addLast(new Node(key,value));
		}else {
			node.value(value);//해당 value 를 대체해주는걸로 중복를 처리함
		}
	
	}
	//key -> data
	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchkey(list,key);
		return node==null? "Not Found": node.value;
	}
	
}



public class MakeHashTable {
	static long beforeTime;//코드 실행 전
	static long afterTime;//코드 실행 후
	static long secDiffTime;//두 시간 차 계산

	public static void main(String[] args) {
		//1. LinkedList 를 이용한 구현
		//동일한 key 에 대해 hash충돌이 일어나는 상황 1000반복
	    beforeTime = System.currentTimeMillis();
		HashTable h = new HashTable(1000);
		for(int i=0;i<20000000;i++) {
			h.put("string1", "string2");
		}
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("linkedList 를 이용한 hashMap: "+secDiffTime);
		
		//2. hashMap api
		beforeTime = System.currentTimeMillis();
		HashMap<String,String> map = new HashMap<>();
		for(int i=0;i<200000000;i++) {
			map.put("string1", "string2");
		}
		afterTime = System.currentTimeMillis();
		secDiffTime = (afterTime - beforeTime)/1000;
		System.out.println("TreeNode 를 이용한 hashMap: "+secDiffTime);
		
	}

}
