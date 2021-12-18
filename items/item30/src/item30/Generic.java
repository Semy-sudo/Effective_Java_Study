package item30;

public class Generic {

//	public static void main(String[] args) {
//		//boxing 자체가 제네릭 메소드임
//		//앞에 어떤 형을 붙이느냐에 따라 집어넣을 수 있는 타입이 달라짐
//		//여기서는 Integer 를 붙여 int 형을 넣었을때 box 객체에 담아 리턴해줌
//		Box<Integer> box1 = Util.<Integer>boxing(100);//box 안에는 int 형이 담길 수 있음
//		int intVal = box1.get();
//		
//		Box<String> box2 = Util.boxing("암묵적 호출");//구체적 타입을 명시하지 않는 호출방법
//		String stringVal = box2.get();
//
//		System.out.println("intval: "+intVal+" stringval: "+stringVal);
//	}
//	
//	//이런식으로 사용자가 정의한 파라미터를 이용해서 메서드 내부적으로 모든 타입을 매핑 시키고 
//	//작업을 다 한 후 메서드 리턴타입을 리턴한다.
	
	
	//제네릭 타입으로 메소드를 만들지 못한 경우
	public static void main(String[] args) {
		//Box 에는 항상 int 형만 넣을 수 있음
		Box box1 = Util.boxing(1);
		int intval = box1.get();
		
	}

}
