package 데코레이터패턴;

public class RoadDisplayWithLane extends RoadDisplay{
	public void draw() {
		super.draw();
		drawLane();//추가적으로 차선 표시
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}
}
