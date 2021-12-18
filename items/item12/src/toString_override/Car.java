package toString_override;

public class Car {
	int num;
	String kind;
	
	Car(int num,String kind){
		this.num = num;
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return this.kind;
	}
}
