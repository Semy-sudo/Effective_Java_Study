package item43;

public class Main {
	public static void main(String[] args) {
		Service service = new Service();
        //1. 메서드 참조
		service.execute(GoshThisClassNameIsHumongous::action);
        //2. 람다
		service.execute(() -> action());
		//3.
		service.execute(new ServiceExecutor() {

			@Override
			public void action() {
				System.out.println("annoy action!!");
				
			}
			
		});
		
        
	}
}
