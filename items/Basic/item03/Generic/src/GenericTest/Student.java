package GenericTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Student<T>{
	//static 변수에는 제네릭을 쓸 수 없음
	//: static 은 클래스가 인스턴스가 되기전에 메모리에 올라가는데,
	// 이때 name의 타입이 결정되지 않았기 때문에 오류가 남.
	//static T name;
	
//	static T getName(T name) {
//		return name;
//	}
	
    public static void main(String[] args) {
    	ArrayList list = new ArrayList<>();
    	list.add(10);
    	list.add(20);
    	list.add("string");
    	
    	
    	
    	int ans = (Integer)list.get(2);//object type -> int type: 컴파일러에서는 에러가 안남
    	//하지만 실제로 들어있는 값은 string 이기에 런타임시 에러 발생
    	System.out.print(ans);
    	
    	//실행시 에러를 어떻게 하면 컴파일 시점으로 끌고올까?
    	
    	ArrayList<Integer> list2 = new ArrayList<>();
    	list2.add(10);
    	//list2.add("hello");//-> 컴파일시 에러를 잡아줌.
    	
    	
    	
    	
    }
	
	
	
	
}
