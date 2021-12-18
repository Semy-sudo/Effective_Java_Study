package 복사생성자;

public class CopyObject {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CopyObject(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private int age;
	
	public CopyObject() {
		
	}
	
	//복사 생성자
	public CopyObject(CopyObject original) {
		this.name = original.name;
		this.age = original.age;
	}
	
	//복사 팩터리
	public static CopyObject copy(CopyObject original) {
		CopyObject copy = new CopyObject();
		copy.name = original.name;
		copy.age = original.age;
		return copy;
	}

}
