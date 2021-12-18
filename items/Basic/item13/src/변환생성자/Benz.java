package 변환생성자;

//클라이언트는 원본타입에 얽매이지 않고 복제본의 타입을 직접 선택할 수 있다.
public class Benz implements Car{
	int price;
	//생성자
	Benz(int price){
		this.price = price;
	}
	//복사 생성자
	Benz(Car origin){
		this.price = origin.price;
	}
	
	@Override
	public void call() {
		System.out.println("부르릉부르릉");
	}
	
	public int getter() {
		return price;
	}

}
