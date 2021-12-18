package 변환생성자;

public class Car_Test {

	public static void main(String[] args) {
		Benz origin = new Benz(10000);
		//클라이언트 원본 타입에 얽매이지 않고 복제본의 타입을 직접 선택할 수 있음.
		//Benz 타입인 origin 객체를 Bmw타입으로 복사할수 있다.
		BMW copy = new BMW(origin);
		copy.setter(20000);
		
		//복사객체의 값을 변경해도 원본객체에 영향을 주지않음. 
		//서로 독립되어있음을 확인할 수 있다.
		System.out.println("원본객체 가격: "+origin.getter());//10000
		System.out.println("복사객체 가격: "+copy.getter());//20000
		
		
		

	}

}
