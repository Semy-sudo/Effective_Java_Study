package 전략패턴;
멤
public class Main {

	public static void main(String[] args) {
		Robot robot = new Robot(new Walk(), new Cold());
		//walk cold
		robot.move();
		robot.temperature();
		
		//run cold
		robot.setMoveStrategy(new Run());//전략 변경
		robot.move();
		robot.temperature();
		//fly hot
		robot.setTemperatureStrategy(new Hot());//전략변경
		robot.move();
		robot.temperature();
	}

}
