package item22;
//태그달린 클래스
public class Figure {
	enum Shape {RECTANGLE, CIRCLE};
	//태그 필드 - 현재 모양을 나타냄
	final Shape shape;
	//사각형일때만 쓰이는 필드
	double width;
	double length;
	//원일때만 쓰이는 필드
	double radius;
	
	Figure(double radius){
		shape = Shape.CIRCLE;
		this.radius = radius;
	}
	
	Figure(double width, double length){
		shape = Shape.RECTANGLE;
		this.width = width;
		this.length = length;
	}
	
	double area() {
		switch(shape) {
		case RECTANGLE:
			return length*width;
		case CIRCLE:
			return Math.PI*(radius * radius);
		default:
			throw new AssertionError(shape);
		}
	}
	
	
}
