package 복사생성자;

public class ClassTest {
	int a;
	int b;
	
	ClassTest(){
		this.a = 1;
		this.b = 2;
	}
	
	ClassTest(ClassTest test){
		test.a = 3;
		test.b = 4;
	}
	
	public void print() {
		System.out.println("a"+a);
		System.out.println("b"+b);
	}
	

}
