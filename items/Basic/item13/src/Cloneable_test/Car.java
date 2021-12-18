package Cloneable_test;

public class Car implements Cloneable{
	int num;
	int[] arr;
	
	String name;
	
	Car(int num, String name){
		this.num = num;
		this.name = name;
		arr = new int[5];
	}
	
	//arr[] 의 clone 을 재귀적으로 호출함으로써 원본객체와 분리할수 있다.
	@Override
	public Car clone() throws CloneNotSupportedException {
		Car result = (Car)super.clone();
		result.arr = arr.clone();//arr 가 final 이 었다면, arr를 다음과 같이 변경 시킬 수 없다.
		return result;
	}
}
