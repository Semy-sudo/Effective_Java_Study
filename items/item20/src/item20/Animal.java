package item20;
//추상메서드
public abstract class Animal extends Creature{
	public Animal(int x,int y, int age) {
		super(x,y,age);
	}
	//모든 동물이 공통적으로 구현하는 attack만 구현해줌
	@Override
	public void attack() {
		System.out.println("나는 동물! 몸을 사용하여 공격!!");
		
	}
	
}
