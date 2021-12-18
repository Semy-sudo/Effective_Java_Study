package item45;

public class Person {
	private String name;
	private int age;
	private String phoneNumber;
	
	public Person(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public int getAge() {
		return age;
	}

	//() -> getName()
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}
