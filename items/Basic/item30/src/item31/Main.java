package item31;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Number> carlist = new ArrayList<>();
		carlist.add(5);
		Car<Number> car = new Car<Number>(carlist);
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		System.out.println(Car.max(list));

	}

}
