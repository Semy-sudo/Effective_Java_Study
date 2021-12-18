package instance0f;

public class PhoneNumber {
	private int firstnum;
	private int secondnum;
	
	public PhoneNumber(int firstnum,int secondnum) {
		this.firstnum  = firstnum;
		this.secondnum = secondnum;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. 자기자신의 참조인지 확인
		if(obj == this) return true;
		//2. 입력이 올바른(비교할 수 있는 타입이지) 확인
		if(!(obj instanceof PhoneNumber)) return false;
		//3. 입력을 올바른 타입으로 형 변환한다 + 입력객체와 자기자신의 대응되는 "핵심" 필드들 모두 일치하는지 검
		PhoneNumber new_obj = (PhoneNumber)obj;
		return 
				new_obj.firstnum==this.firstnum && new_obj.secondnum ==this.secondnum;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
