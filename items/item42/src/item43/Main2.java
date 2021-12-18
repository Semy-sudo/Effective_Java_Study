package item43;

import java.lang.Thread.State;

public class Main2 {

	public static void main(String[] args) {
		StateOwner stateOwner = new StateOwner();
		stateOwner.addStateListener(new StateChangeListener() {

			@Override
			public void onStateChange(State oldState, State newState) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		//-> 람다
		stateOwner.addStateListener((oldState, newState) -> System.out.println("state change!!"));

	}

}
