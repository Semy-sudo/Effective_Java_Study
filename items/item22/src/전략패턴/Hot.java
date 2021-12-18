package 전략패턴;

public class Hot implements TemperatureStrategy{

	@Override
	public void temperature() {
		System.out.println("영상입니다.");
	}

}
