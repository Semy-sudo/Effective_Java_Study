package releasse;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class CacheSample {

    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
		WeakHashMap<Integer, String> map2 = new WeakHashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;

        map1.put(key1, "test a");
        map2.put(key2, "test b");

        key1 = null;
		key2 = null;

        System.gc();  //강제 Garbage Collection

        System.out.println("After garbage, hashMapObj" + map1);//{key1 = value1}
		System.out.println("After garbage, WeakhashMapObj" + map2);//{}
				
    }
}


