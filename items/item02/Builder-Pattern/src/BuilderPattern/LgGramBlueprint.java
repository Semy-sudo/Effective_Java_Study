package BuilderPattern;

public class LgGramBlueprint extends Blueprint{

	private Computer computer;
	
	LgGramBlueprint(){
		computer = new Computer("default","default","default");
	}
	
	@Override
	public void setCpu() {
		computer.setCpu("i7"); 
	}

	@Override
	public void setRam() {
		computer.setRam("8G");
	}

	@Override
	public void setStorage() {
		computer.setStorage("258G SSD");
	}
	
	public Computer getComputer() {
		return computer;
	}

}
