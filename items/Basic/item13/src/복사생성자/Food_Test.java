package 복사생성자;

import java.util.ArrayList;
import java.util.List;

public class Food_Test {

	public static void main(String[] args) {
		Food food = new Food();
		food.name = "cake";
		food.year = 1997;
		List<Apple> food_list = new ArrayList<>();
		food_list.add(new Apple("pineapple",1999));
		food.list = food_list;
		
		//food 객체를 복사
		Food new_food = new Food(food);//복
		//new_food 를통해 원본객체의 필드를 바꿀 수 있을까????
		new_food.name = "ice_cream";
		new_food.year = 2000;
		new_food.list.add(new Apple("orange",2000));
		
		System.out.println("====[food]====");
		System.out.println("원본음식 이름: "+food.name);
		System.out.println("원본음식 날짜: "+food.year);
		for(int i=0;i<food.list.size();i++) {
			System.out.println(food.list.get(i).name);
			System.out.println(food.list.get(i).year);
		}
		
		System.out.println("====[new_food]====");
		System.out.println("새음식 이름: "+new_food.name);
		System.out.println("새음식 날짜: "+new_food.year);
		for(int i=0;i<new_food.list.size();i++) {
			System.out.println(new_food.list.get(i).name);
			System.out.println(new_food.list.get(i).year);
		}
		
		//결과:
		//위의 food 의 name,year 는 값복사가 잘 되어 복사객체가 원본객체에 영향을 미치지 않지만, list 는 참조변수가 복사되어 원본객체에 영향을 미친다.
		//new_food 가 food 의 영향을 미쳤다고 볼 수 있다.
		//즉, 실제 데이터는 1개뿐이고 이름표만 2개인 경우이다.
		

	}

}
