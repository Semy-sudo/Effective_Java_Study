package 불변객체;

public class ImmutablePerson {
	private final int age;
	private final int name;
	
	public ImmutablePerson(int age,int name){
		this.age = age;
		this.name = name;
	}

//	@Override
//	public String toString() {
//		return "ImmutablePerson [age=" + age + ", name=" + name + "]";
//	}
	
	

}
