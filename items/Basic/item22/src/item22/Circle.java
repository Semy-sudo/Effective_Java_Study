package item22;

public class Circle extends Figure_abstract{
	final double radius;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double area() {
		return Math.PI*(radius * radius);
	}
	
	//태그 클래스와 비교했을때
	//1. 불필요한 switch  문이 없어짐 - 다른 클래스 추가시 로직 작성해야함
	//2. 불필요한 초기화가 없어짐. 다른 클래스까지 초기화 하지 않아도됨
	//3. 독립적인 구조 덕분에 계층구조를 확장하기가 더 쉽다.
	

}
