package item43;

import java.util.HashMap;
import java.util.Map;

public class MapLamdaEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1);
//		map.merge("apple", 1, (a,b)-> a+b);
		map.merge("apple", 1, Integer::sum);
		System.out.println(map.get("apple"));
	}

}
