package 복사생성자;

public class Test {

	public static void main(String[] args) {
		ClassTest origin = new ClassTest();//자동으로 값이 들어감
		origin.print();
		System.out.println();
		
		ClassTest copy = new ClassTest(origin);//생성자를 통해 복사
		origin.print();
		copy.print();
		System.out.println();
		
		//url
		//equals
		//hashmap
	}

}
