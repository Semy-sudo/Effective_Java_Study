package item45;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("짱구",23,"010-1234-1234"));
		personList.add(new Person("유리",23,"010-1234-1234"));
		personList.add(new Person("철수",23,"010-1234-1234"));
		
		personList.stream()
			.sorted(Comparator.comparing(Person::getAge))
			.forEach(p -> System.out.println(p.getName()));
		
//		personList.stream()
//		.sorted(
//				new Comparator<Person>() {
//					@Override
//					public int compare(Person o1, Person o2) {
//						return o1.getAge() - o2.getAge();
//					}
//				}
//				)
//		.forEach(p -> System.out.println(p.getName()));
		
		
		personList.stream()
		.sorted(Comparator.comparing(
				new Function<Person,Person>() {

					@Override
					public Person apply(Person p) {
						// TODO Auto-generated method stub
						return null;
					}
					
				}
				))
		.forEach(p -> System.out.println(p.getName()));
		
		
		//list -> map
		//메서드 참조: Class::method 형태로 사용
		//Function.identity: 자기자신 반환
//		Map<String, Person> map = personList.stream()
//				.filter(person -> person.getAge()>24)
//				.collect(Collectors.toMap(Person::getName,  Function.identity()));
//		
		// 늘려보기
		//Function -> 함수형 인터페이스을 Person클래스의 getName 함수로 대체하겠다.
//		Map<String, Person> map = personList.stream()
//				.collect(Collectors.toMap(new Function<Person, String>(){
//					@Override
//					public String apply(Person p) {
//						return p.getName();
//					}
//				}, new Function<Person,Person>(){
//					@Override
//					public Person apply(Person p) {
//						return p;
//					}
//				}));
		
//		Map<Integer, Person> personMap = personList.stream()
//				.collect(Collectors.toMap(o -> o.getAge(),
//						Function.identity(),
//						(oldValue, newValue)-> newValue));
//		
//		Map<Integer, List<Person>> duplicatedMap = personList.stream()
//				.collect(Collectors.groupingBy(Person::getAge));//나이를 키로
//		
//		for(int key: duplicatedMap.keySet()) {
//			System.out.println(key);
//			for(int i=0;i<duplicatedMap.get(key).size();i++) {
//				List<Person> list = duplicatedMap.get(key);
//				System.out.println(list.get(i).getName());
//			}
//		}
		
		Stream<String> stream = Stream.of("철수","훈이",null,"유리",null);
		//List<String> filteredList = stream.filter(Objects::nonNull)
		//		.collect(Collectors.toList());
		
		List<String> filteredList = stream.filter(
				//원래는 함수형 인터페이스를 매개변수로 받는것을
				//메서드 참조로 그 구현을 대체할 수 있다.
					new Predicate<Object>() {
						public boolean test(Object obj) {
							return obj!=null;
						};
					}
				)
				.collect(Collectors.toList());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
