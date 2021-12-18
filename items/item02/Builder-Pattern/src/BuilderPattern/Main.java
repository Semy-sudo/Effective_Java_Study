package BuilderPattern;

//클라이언트측에서
//가독성 있고 쓰기 쉬움
//불변식보장하려면? 빌더로 부터 매개변수 복사한 후 해당 객체 필드 검사
public class Main {

	public static void main(String[] args) {
		//NutritionFacts nf = new NutritionFacts.Builder(240).calories(100).build();
		
		ComputerFactory factory = new ComputerFactory();
		
		factory.setBlueprint(new LgGramBlueprint());//설계도 대로 세팅
		factory.make();//설계도로 팩토리를 통해 만들어주고 
		
		Computer computer = factory.getComputer();
		
		

	}

}
