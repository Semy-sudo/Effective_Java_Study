package 데코레이터패턴;

public class Client {

	public static void main(String[] args) {
		RoadDisplay road = new RoadDisplay();
		road.draw();//기본 도로만 표시
		
		RoadDisplayWithLane roadWithLane = new RoadDisplayWithLane();
		roadWithLane.draw();

	}

}
