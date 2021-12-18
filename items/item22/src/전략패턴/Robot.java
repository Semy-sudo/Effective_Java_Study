package 전략패턴;
//전략을 분리한다. 전략을 인터페이스화 한다.
//단순히 기능구현을 강제하는것이 아닌, 전략을 분리하여 기능의 조합만큼 클래스를 만드는 것이 아니라, 
//전략을 조합하여 클래스를 만듬으로써  
public class Robot {
	private MoveStrategy moveStrategy;//이동전략
	private TemperatureStrategy temperatureStrategy;//온도전략
	
	public Robot(MoveStrategy moveStrategy, TemperatureStrategy temperatureStrategy){
		this.moveStrategy = moveStrategy;
		this.temperatureStrategy = temperatureStrategy;
	}
	
	public void move() {
		moveStrategy.move();
	}
	
	public void temperature() {
		temperatureStrategy.temperature();
	}

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void setTemperatureStrategy(TemperatureStrategy temperatureStrategy) {
		this.temperatureStrategy = temperatureStrategy;
	}
	
	//더 나아가 setter 를 통해 전략을 중간에 변경할 수도 있다.
	
}
