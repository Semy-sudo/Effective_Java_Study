package serializable_field_Test;

import java.io.Serializable;
import java.util.Base64;

public class Member implements Serializable {
	private String name;
	private int age;
	private String email;

	Member(String name, int age, String email){
		this.name = name;
		this.age = age;
		this.email = email;
	}
}