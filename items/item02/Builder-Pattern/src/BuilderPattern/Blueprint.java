package BuilderPattern;

public abstract class Blueprint {
	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	
	public Computer getComputer() {
		return null;
	}
}
