package item45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		String[] intArray = {"hello world","yello","green","hello"};
		Set<String> set = Arrays.asList(intArray)//
				.stream()//1. stream 생성
				.filter(e -> e.startsWith("hello")) //2. 중간연산
				.collect(Collectors.toSet()); //3. 최종연산
		set.forEach(e -> System.out.println(e));
		
		//스트림은 다양한 데이터 소스에서 생성할 수 있다.
		//1. 컬렉션
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		Stream<Integer> stream = list.stream();
//		stream.forEach(System.out::println);//forEach 메소드를 이용한 스트림 요소의 순차적 접근
//		
//		//2. 배열에서 스트림 생성
//		String[] arr = new String[] {"넷","셋","둘","하나"};
//		Stream<String> stream1 = Arrays.stream(arr);
//		stream1.forEach(System.out::println);
//		
//		//특정 타입의 난수로 이루어진 스트림 생성
//		IntStream stream2 = new Random().ints(4);
//		stream2.forEach(System.out::println);
//		//stream2.forEach(System.out::println);
//		
//		IntStream stream3 = IntStream.of(7,5,5,6);
//		stream3.distinct().forEach(e -> System.out.println(e+" "));
		
		//작업을 내부 반복으로 처리
		String[] strList = {"a","b","c","d"};
		for(String str: strList) {
			System.out.print(str);
		}
		
		Stream<String> stream = Stream.of(strList);
		stream.forEach(System.out::print);
		
		
		
	}

}
