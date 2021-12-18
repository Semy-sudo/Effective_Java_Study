package item44;

import java.util.Random;

public class TheadRunner {

	public static void main(String[] args) {
		final Random random = new Random();
		//0) 함수로 따로 만드는 방법 
		Runnable runnable = new MyRunnable();
		Thread thread0 = new Thread(runnable);
		thread0.start();
		
		//1) 익명 클래스로 구현하는 방법
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				String threadName = Thread.currentThread().getName();
				System.out.println(threadName + " has been started!");
				int delay = 1000 + random.nextInt(5000);
				try {
					Thread.sleep(delay);
				}catch (InterruptedException e) {
				      e.printStackTrace();
			    }
				System.out.println(threadName + " has been ended (" + delay + "ms)");
			}
			
		});
		
		thread1.start();
		
		//2) 람다로 구현하는 방법
		Thread thread2 = new Thread( () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName);
			int delay = 1000 + random.nextInt(5000);
			try {
				Thread.sleep(delay);
			}catch (InterruptedException e) {
			      e.printStackTrace();
		    }
			System.out.println(threadName + " has been ended (" + delay + "ms)");
		});

		thread2.start();
		
		//3) 이 경우는 메서드 참조가 없다.
		
		
		//람다의 단점
		//1. 재활용성. 중복된 코드가 나올 수 있다. 
		//2. 디버깅시 콜스택이름 떄문에 한눈에 들어오지 않는다.
		
		//람다를 써도 될때
		//이 함수를 딱 한번만 구현하면 된다는 확실한 보장이 있을 때
		//정말 단순한 구현일때
		
		//하지만 "람다를 써도 될때" 와 같은 상황이 별로 없다.
		//그러므로 람다를 쓰지 않는게 좋다.
		
	}

}
