package BuilderPattern;

//설계도를 가지고 있고
//그 설계도를 통해 만들고 Blueprint 객체를
//만들어진걸 컴퓨터로 리턴해 준다.
public class ComputerFactory {
	
	private Blueprint print;
	
	//다양한 블루 프린트 설계를 가질 수 있음
	public void setBlueprint(Blueprint print){
		this.print = print;
	}
	
	//여기서 Blueprint 에 세팅해야 할 값이 많다면
	//간단하게 set함수를 통해 세팅해 줄 수 있다.
	//즉 기존에 클라이언트가 할 일을 make 함수를 호출하는 걸로 줄여준다.
	
	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	
	//설계도가 반영된 컴퓨터를 리턴해준다.
	public Computer getComputer() {
		return print.getComputer();
	}

}
