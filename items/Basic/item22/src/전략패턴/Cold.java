package 전략패턴;

public class Cold implements TemperatureStrategy{

	@Override
	public void temperature() {
		System.out.println("영하 입니다.");
	}

}
