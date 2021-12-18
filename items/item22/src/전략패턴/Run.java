package 전략패턴;

public class Run implements MoveStrategy{

	@Override
	public void move() {
		System.out.println("뛰어갑니다.");
	}

}
