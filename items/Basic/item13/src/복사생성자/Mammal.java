package 복사생성자;

//Mammal 부모 클래스
class Mammal {

	protected String type;
	protected String name;

	public Mammal(String type) {
		this.type = type;
	}

	// copy constructor
	public Mammal(Mammal original) {
		this.type = original.type;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Mammal mammal = (Mammal) o;

		if (!type.equals(mammal.type))
			return false;

		return true;
	}
	
	//자식 클래스타입으로 복사하기 위한 메소드
	public Mammal cloneObject() {
		return new Mammal(this);
	}
	
	public String typegetter() {
		return type;
	}
	public String namegetter() {
		return name;
	}
	
	
}

//Human 클래스
class Human extends Mammal {

	
	public Human(String type, String name) {
		super(type);
		this.name = name;
	}

	// copy constructor
	public Human(Human original) {
		super(original.type);
		this.name = original.name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;

		Human human = (Human) o;

		if (!type.equals(human.type) || !name.equals(human.name))
			return false;

		return true;
	}
	
	@Override
	public Human cloneObject() {
		return new Human(this);
	}
	
	public String typegetter() {
		return type;
	}
	
	public String namegetter() {
		return name;
	}
	
}