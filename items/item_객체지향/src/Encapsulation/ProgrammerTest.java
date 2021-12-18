package Encapsulation;

public class ProgrammerTest {

	public static void main(String[] args) {
		Programmer pg = new Programmer();
		pg.setName("semy song");
		pg.setBlog("yein blog");
		System.out.println("이름: "+pg.getName());
		System.out.println("블로그: "+pg.getBlog());
	}

}
