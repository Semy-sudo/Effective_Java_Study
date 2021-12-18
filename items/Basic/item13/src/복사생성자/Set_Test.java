package 복사생성자;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Set_Test {

	public static void main(String[] args) {
		Set mySyncSet = Collections.synchronizedSet(new HashSet());
		//복사 생성자를 사용하여 세트의 복사본을 만드는 경우
		Set mySetCopy = new HashSet(mySyncSet);
		//이때 스레드는 안전하다고 할수 있을까?
		//복사 생성자로 객체를 만듬으로써 원본객체와 완전히 분리된 객체가 생성되었다.
		
		

	}

}
