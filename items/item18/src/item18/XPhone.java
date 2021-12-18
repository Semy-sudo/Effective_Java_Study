package item18;
//XPhone has a Phone
//상속 받지 않고 컴포지션 관계
public class XPhone {
	private Phone phone; 
	
	XPhone(Phone phone){
		this.phone = phone;
	}
	
	public void userPhone(Phone phone) {
		System.out.println("발로 사용한다.");
	}

}
