package item20;
//추상클래스.
// age, move 구현되어있음
// attack, printinfo 구현안되어있음
public abstract class Creature {
	//생명체가 갖는 요소인 위치와 나이
    private int x;
    private int y;
    private int age;
    
    public Creature(int x, int y, int age) {
        this.age = age;
        this.x = x;
        this.y = y;
    }
    //생명체라면 나이를 먹고 x좌표로 이동할수 있는 부분이 공통임으로 구현해줌
    public void age() {
        age++;
    }
    
    public void move(int xDistance) {
        x += xDistance;
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    //추상메서드.
    //공격하는 기능과 정보를 출력하는 기능은 생명체마다 가지고 있어야 하지만 기능구현이 다르기 때문에 
    //하위클래스에서 처리하도록 한 것.
    public abstract void attack();
    public abstract void printInfo();
    
    @Override
    public String toString() {
        return "x : " + x + ", y : " + y + ", age : " + age;
    }
}