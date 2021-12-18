package instance0f;

// instanceof 의 쓰임새:
// 참조변수가 참조하고 있는 인스턴스의 실제 타입을 알아보기 위해 사용
// 참조변수 instanceof 클래스명 -> true:참조변수가 클래스로 형 변환이 가능하다.

//> 헷갈리는점
// f 는 본인객체의 주솟값을 담고 있을 것 같은데 Instanceof 로 비교를 하면 왜 Car, FireEngine 둘다 맞다고 하는건지
public class Instanceof {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine f = new FireEngine();
		Ambulance a = new Ambulance();
		
		if(f instanceof FireEngine) {
			System.out.println("1. 네");
		}
		if(f instanceof Car) {
			System.out.println("2. 네");
		}
		
	}

}

class Car{
	String color;
	int num;//번호가 같으면 같은 차로 구현
	
	void drive() {
		System.out.println("운전함");
	}
	
	void stop() {
		System.out.println("멈춤");
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		return super.equals(obj);
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car obj_car = (Car)obj;//형변환
			if(obj_car.num==num) return true;
		}
		return false;
	}

}

class FireEngine extends Car{//소방차
	void water() {
		System.out.println("물을 뿌림");
	}
}

class Ambulance extends Car{//앰뷸런스
	void siren() {
		System.out.println("siren~~~~~~~~~~~~!");
	}
}
