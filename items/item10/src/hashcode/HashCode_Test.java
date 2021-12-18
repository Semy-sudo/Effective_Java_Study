package hashcode;

import java.net.URL;

public class HashCode_Test {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = s2;
		
		//모두 동일한 값을 가짐
		System.out.println("s1 hashcode"+s1.hashCode());
		System.out.println("s2 hashcode"+s2.hashCode());
		System.out.println("s3 hashcode"+s3.hashCode());
		
		Person p1 = new Person("yein");
		Person p2 = new Person("yein");
		
		//다른 값을 반환함
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		URL url = new URL();
		
		
	}

}
