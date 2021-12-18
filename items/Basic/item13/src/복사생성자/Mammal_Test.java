package 복사생성자;

public class Mammal_Test {

	public static void main(String[] args) {
		Mammal mammal = new Mammal("Human");
		Mammal copyMammal = new Mammal(mammal);//복사 생성자
		
		Human human = new Human("Mammal","Jong");
		Human copyhuman = new Human(human);
		
		//부모클래스에서 자식 클래스 호출
		Mammal mammalHuman = new Human("Human","jong");
		
		//부모클래스 타입의 객체로 자식 클래스의 복사를 하려면 불가능
		// 1) 컴파일 에러 발생
		//Mammal copyMammalHuman = new Human(mammalHuman);

		// 2) 이렇게 하면 복사는 되지만 equal 한 오브젝트가 아니게된다
		//Mammal copyMammalHuman = new Mammal(mammalHuman);
		
		//부모 클래스와 자식 클래스에서 자신의 타입으로 리턴해주는 cloneObject 함수를 만들면 해결
		Mammal copyMammalHuman = mammalHuman.cloneObject();
		//결론적으로, 자식 타입의 객체를 안전하게 부모타입의 객체체 복사할수 있다.
		//System.out.println("원본객체 "+mammalHuman.namegetter());
		//System.out.println("복사객체 "+copyMammalHuman.namegetter()); //같은 결과가 잘 나온다.
		
		//복사객체의 이름 변경
		copyMammalHuman.type = "Mammal";
		System.out.println("변경 후 원본객체 "+mammalHuman.typegetter());
		System.out.println("변경 후 복사객체 "+copyMammalHuman.typegetter());//복사객체만 독립적으로 변경됨
		
		copyMammalHuman.name = "song";
		System.out.println("변경 후 원본객체 "+mammalHuman.namegetter());
		System.out.println("변경 후 복사객체 "+copyMammalHuman.namegetter());
		

	}

}
