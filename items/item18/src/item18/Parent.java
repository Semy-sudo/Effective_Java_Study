package item18;

public class Parent {
	private int age;
	public void add() {
		System.out.println("parent add");
	}
	//자식클래스의 super를 통해 호출이 되지만, this는 자식클래스를가리킴
	public void addAll() {
		this.age = 2;
		this.size();
		System.out.println(this.getClass());//class item18.Child
		add();//누구의 add? child 의 add 가 호출됨
	}
	
	public void size() {
		System.out.println("Parent size!");
	}

}
