package cleaner;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
	private static final Cleaner cleaner = Cleaner.create();

	//Room -> State, State -> Room 순환참조가 발생하면 gc에 의해 수거되지 못함
	//정적 클래스가 아니면 자동으로 바깥객체의 참조를 가짐
	private static class State implements Runnable{
		int numJunkPiles;//방 안 쓰레기 수
		
		State(int numJunkPiles){
			this.numJunkPiles = numJunkPiles;
		}
		
		//close 나 cleaner가 호출한다.
		@Override
		public void run() {
			System.out.println("방 청소");
			numJunkPiles = 0;
		}
		
	}
	
	private final State state;
	
	private Cleaner.Cleanable cleanable;
	
	public Room(int numJunkPiles) {
		this.state = new State(numJunkPiles);
		cleanable = cleaner.register(this, state);
	}

	@Override
	public void close() throws Exception {
		cleanable.clean();
	}

}
