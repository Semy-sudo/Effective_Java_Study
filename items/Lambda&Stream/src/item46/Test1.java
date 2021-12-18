package item46;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;

import java.rmi.server.Operation;

//stream API Collectors 수집기에 대해서
//수집기를 사용해서 stream의 원소들을 손쉽게 모드는 방법에 대해...
public class Test1 {

	public static void main(String[] args) {
		Map<String,Integer> freq = new HashMap<>();
		freq.put("a",2);
		freq.put("b",1);
		freq.put("c",3);
		
		//Q. freq 맵 에서 가장 흔한 단어 3개를 뽑아내는 파이프라인
		List<String> topTree = freq.keySet().stream()
				.sorted(Comparator.comparing(freq::get).reversed())
				.limit(3)
				.collect(toList());// 스트림 요소들을 어떻게 뽑아낼 것인가
		for(String str: topTree) {
			//System.out.println(str); //c a b
		}
		
		//Q. ToMap 수집기 - Stream 요소 Map인스턴스로 수집
		ArrayList<String> givenList = new ArrayList<>();
		givenList.add("aaaaa");
		givenList.add("bbbb");
		givenList.add("ccccc");
		Map<String, Integer> result = givenList.stream()
				.collect(toMap(Function.identity(), String::length));
		for(int i: result.values()) {
			//System.out.println(i);
		}
		
		
		//Q. Collectors.groupingBy()
		Map<Integer, Set<String>> result2 = givenList.stream()
				.collect(groupingBy(String::length, toSet()));
		
		for(int i: result2.keySet()) {
			System.out.println(i);
			System.out.println(result2.get(i));
		}
		
		//Q. Collectors.gourpingBy() 
		//Case1. groupingBy(Function<? super T,? extends K> classifier)
		//학생들을 성별로 그룹핑하고 나서, 같은 그룹에 속하는 학생 List를 생성한 후,
		//성별을 Key로, 학생 List를 Value로 갖는 Map을 생성한다.

		List<Student> totalList = Arrays.asList(
				new Student("semy",11,Gender.FEMAL),
				new Student("sindy",12,Gender.FEMAL),
				new Student("candy",13,Gender.MAL)
		);
		
		Stream<Student> totalStream = totalList.stream();
		Function<Student, Gender> classifier = Student::getGender; //성별로 식별
		Collector<Student, ?, Map<Gender, List<Student>>> collector =  //
				Collectors.groupingBy(classifier);
		
		Map<Gender, List<Student>> mapBySex = totalStream.collect(collector);
		System.out.println(mapBySex);
		
				
				
		
		
		

		
		
		
		
		
		
		
	}

}
