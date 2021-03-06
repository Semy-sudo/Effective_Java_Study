package BuilderPattern2;
//Computer 객체의 생성을 관리한다.
public class ComputerBuilder {
	
	private Computer computer;
	
	private ComputerBuilder() {
		computer = new Computer("default","default","default");
	}
	
	
	//필수 매개변수가 있으면 세팅해주고 
	//없으면 객체만 만들어줌
	public static ComputerBuilder start() {
		return new ComputerBuilder();
	}
	
	public ComputerBuilder setCpu(String data) {
		computer.setCpu(data);
		return this;
	}
	
	public ComputerBuilder setRam(String data) {
		computer.setRam(data);
		return this;
	}
	
	public ComputerBuilder setStorage(String data) {
		computer.setStorage(data);
		return this;
	}
	
	public Computer build() {
		return this.computer;
	}
}
