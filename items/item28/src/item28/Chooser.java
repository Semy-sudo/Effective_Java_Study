package item28;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser {
	private final T[] choiceArray;
	
	public Chooser(Collection<T> choices) {
		this.choiceArray = choices.toArray();
	}
	
	//메서드를 호출할 때마다 반환된 Object를 원하는 타입으로 형 변환해야 함
	public Object choose() {
		ThreadLocalRandom random = ThreadLocalRandom.current();
        return choiceArray[random.nextInt(choiceArray.length)];
	}
	
	
}
