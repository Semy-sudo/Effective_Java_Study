package 불변객체;

public class Main {

	public static void main(String[] args) {
		ImmutablePerson person = new ImmutablePerson(3,5);
		System.out.println(person.getClass());
		
		person = new ImmutablePerson(4,4);
		System.out.println(person.getClass());
	}

}
