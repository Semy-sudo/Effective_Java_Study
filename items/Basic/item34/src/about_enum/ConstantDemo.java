package about_enum;

//인터페이스를 통해서 상수의 이름이 충돌할 일이 없다.
/*class Fruit{
	//데이터 타입은 같지만 각각의 인스턴스를 가지고 있음.
	public static final Fruit APPLE = new Fruit();
	public static final Fruit PEACH = new Fruit();
	public static final Fruit BANANA = new Fruit();
}*/
enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");//상수가 어떠한 값을 가지게 한다.
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit(String color) {
		System.out.println("Call Constructor "+this);
		this.color = color;
	}
}
enum Company{
	GOOGLE, APPLE, ORACLE
}

//class Company{
//	public static final Company APPLE = new Company();
//	public static final Company GOOGLE = new Company();
//	public static final Company FACEBOOK = new Company();
//}

public class ConstantDemo {
//	//과일 이름 상수
//	private final static int FRUIT_APPLE = 1;//변수의 값이 한번 지정되면 변경되지 않음
//	private final static int FRUIT_PEACH = 2;
//	
//	//기업 이름 상수
//	private final static int COMPANY_GOOGLE = 1;
//	private final static int COMPANY_APPLE = 2; //기업 이름이랑 과일 이름이랑 겹침!!
	
	public static void main(String[] args) {
		
		
		for(Fruit f: Fruit.values()) {
			System.out.println(f+", "+f.getColor());
		}
	}

}
