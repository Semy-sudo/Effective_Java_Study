package 복사생성자;

import java.util.ArrayList;
import java.util.List;

public class Food {
	String name;
	int year;
	List<Apple> list;

	// 1. 값 복사가 아니라 참조 복사가 (얕은복사)
//	public Food(Food food) {
//		this.name = food.name;
//		this.year = food.year;
//		this.list = food.list;
//	}

	// 2. 값 복사. 독립적인 객체 생성 (깊은복사)
	public Food(Food food) {
		this.name = new String(food.name);
		this.year = food.year;
		// this.list = food.list;//list내부의 값이 아닌, 참조변수가 복사됨
		this.list = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			this.list.add(new Apple(food.list.get(i)));
		}
	}
	// 클래스의 깊은복사는 이렇게 간편하지 않다.
	// int,float, double 과 같은 기초 변수 이외의 모든 참조변수는 new 연산자를 이용하여 객체를 새로 생성하고, 내용물을 복사하게 만들어야 
	// 만약 List 와 같은 컨테이너 멤버로 가지고 있다면 아이템 하나하나를 순환하면서 값을 복사해야 한다.
	// 이같은 클래스 복사를 "복사 생성자" 라고 한다.
	

	public Food() {
		// TODO Auto-generated constructor stub
	}
}

class Apple {
	String name;
	int year;

	Apple(String name, int year) {
		this.name = name;
		this.year = year;
	}

	Apple(Apple apple) {
		this.name = new String(apple.name);
		this.year = apple.year;
	}
}
