package instance0f;

public class ColorPoint extends Point{
	private final String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		//비교대상의 부모 클래스가 다르면 false
		if(!(obj instanceof Point)) return false;
		//Point 객체가 들어왔다면 색상은 무시하고 비교
		if(!(obj instanceof ColorPoint)) return obj.equals(this);
		//같은 ColorPoint 객체라면 색상까지 비교
		return super.equals(obj) && ((ColorPoint)obj).color.equals(this.color);
	}
	
	//같은 클래스 끼리의 비교가 아니라면 무조건 false를 반환
//	@Override
//	public boolean equals(Object obj) {
//		if(obj==null || getClass() != obj.getClass()) return false;
//		ColorPoint cp = (ColorPoint)obj;
//		return cp.color.equals(this.color);
//	}
}
