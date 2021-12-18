package toString_override;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		String s1 = "hello";
		System.out.println(s1);
		System.out.println(s1.toString());
		
		Car car = new Car(1,"semy-car");
		System.out.println(car);//toString_override.Car@2bbf4b8b
		System.out.println(car.toString());
		
		//BigInteger bi = new BingInteher();
	}

}
