package 전략패턴;

public class Walk implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("걸어갑니다. ");
	}

}
