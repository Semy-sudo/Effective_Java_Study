package instance0f;

import java.util.HashMap;

public class PhoneNumber_Test {

	public static void main(String[] args) {
		HashMap<PhoneNumber, String> map = new HashMap<>();
		map.put(new PhoneNumber(123,456), "semy");
		
		System.out.println(map.get(new PhoneNumber(123,456)));//hashcode 를 재 정의 하지 않았을때 -> null 이 나옴
		System.out.println(map.get(new PhoneNumber(123,123)));
		
		//두 인스턴스가 논리적으로는 동치임을 확인할 수 있다.
		if(new PhoneNumber(123,456).equals(new PhoneNumber(123,456))) {
			System.out.println("두개의 인스턴스가 같다고 정의되어 있음");
		}
		
		//get 으로 논리적으로는 동치인 인스턴스의 value 값을 찾으려고 하면 null 이 반환됨
		//이유: hashcode 값이 재 정의 되지 않았기 때문임. 두 인스턴스가 서로 다른 hashcode 값을 반환하여 찾을 수 없었던것
		
			}

}
