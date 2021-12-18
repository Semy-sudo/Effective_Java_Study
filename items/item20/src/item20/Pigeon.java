package item20;

public class Pigeon extends Animal implements Flyable{
	public Pigeon(int x, int y, int age) {
        super(x, y, age);
    }
    
    @Override
    public void fly(int yDistance) {
        setY(getY() + yDistance);
    }
    
    @Override
    public void flyMove(int xDistance, int yDistance) {
        setY(getY() + yDistance);
        setX(getX() + xDistance);
    }
    //Animal 추상클래스에서 추상메서드로 남겨놨었던 출력기능
    @Override
    public void printInfo() {
        System.out.println("Pigeon -> " + toString());
    }
    //동물 공통 기능인 attack도 당연히 사용할 수 있다.
    @Override
    public void sing() {
    	System.out.println("i am dancing");
    }
}
