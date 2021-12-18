package instance0f;

import java.util.Set;

public class Point {
	private final int x;
	private final int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	private static final Set<Point> unitCircle = Set.of(
			new Point(1,0), new Point(0,1),
			new Point(-1,0), new Point(0,-1)
			);
	
	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);//equals 메소드를 이용해 포함여부 확인
	}
	
	//x와 y가 모두 같은때만 true를 반환하도록 재정의
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point)) return false;
		Point p = (Point)obj;
		return p.x == this.x && p.y == this.y;
	}

}
