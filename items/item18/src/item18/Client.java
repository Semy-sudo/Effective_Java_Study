package item18;

public class Client {

	public static void main(String[] args) {
		//1. XPhone (컴포지션 관계일때)
		Phone phone = new Phone();
		XPhone xphone = new XPhone(phone);
		xphone.userPhone(phone);//이상한 결과가 나왔을때
		

	}

}
