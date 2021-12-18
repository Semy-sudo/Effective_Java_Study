package item18;

//SmartPHone is a Phone 관계일때,
//상위클래스가 변경되면 하위클래스에게 영향미침
public class SmartPhone extends Phone{
	private int callCount;
	@Override
	public void call() {
		// TODO Auto-generated method stub
		super.call();
	}
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.userPhone();//상위 클래스의 영향을 받아 이상한 결과가 나온다.
		
	}
}
