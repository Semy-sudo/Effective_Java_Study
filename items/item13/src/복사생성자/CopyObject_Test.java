package 복사생성자;

public class CopyObject_Test {

	public static void main(String[] args) {
		CopyObject origin = new CopyObject("yein",20);
		CopyObject copy = new CopyObject(origin);//생성자를 통해 원본객체를 복사한다.
		CopyObject factory = CopyObject.copy(origin);
		
		copy.setAge(30);
		copy.setName("yeincopy");

		factory.setAge(40);
		factory.setName("yeinfactory");
		
		//값만 복사하는 깊은복사가 이루어져 원본객체가 변경되지 않았음을 확인할 수 있다.
		System.out.println("원본객체 이름: " +origin.getName());
		System.out.println("원본객체 나이: "+ origin.getAge());
	}

}
