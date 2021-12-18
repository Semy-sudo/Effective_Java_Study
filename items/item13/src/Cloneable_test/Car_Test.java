package Cloneable_test;

import java.util.Stack;

public class Car_Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		//불변객체를 super.clone() 하면 독립적인 객체로 만들어진다.
		//즉, 복제된 객체가 변경되도 원본 객체가 변경되지 않는다.
		Car car1 = new Car(3,"bmw");
		car1.arr[0] = 10;
		Car car2 = (Car)car1.clone();
		car2.name = "Benz";
		car2.arr[0] = 20;
		System.out.println(car1.name);//bmw
		System.out.println(car2.name);//benz
		System.out.println(car1.arr[0]);//20
		System.out.println(car2.arr[0]);//20
		
		
		Stack<Integer> st1 = new Stack<>();
		st1.add(1);
		Stack<Integer> st2 = (Stack)st1.clone();
		st2.add(2);
		for(int s=0;s<st1.size();s++) {
			System.out.println(st1.get(s));//1
		}
		System.out.println();
		for(int s=0;s<st2.size();s++) {
			System.out.println(st2.get(s));//1 2
		}
	}

}
