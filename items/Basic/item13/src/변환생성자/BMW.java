package 변환생성자;

public class BMW implements Car{
	private int price;
	BMW(int price) {
		this.price = price;
	}
	BMW(Car origin){
		this.price = origin.price;
	}
	@Override
	public void call() {
		System.out.println("르르르릉");
	}
	
	public void setter(int price) {
		this.price = price;
	}
	
	public int getter() {
		return price;
	}
}
