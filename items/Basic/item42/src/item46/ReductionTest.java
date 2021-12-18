package item46;

import java.util.Optional;
import java.util.stream.Stream;

public class ReductionTest {

	public static void main(String[] args) {
		
		//초기값 없는 Reduction
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		Optional<Integer> sum = numbers.reduce(Integer::sum);
		sum.ifPresent( s -> System.out.println(s));
		
		//초기값 있는 Reduction
		Stream<Integer> numbers2 = Stream.of(1,2,3);
		Integer sum2 = numbers2.reduce(10, Integer::sum);
		System.out.println("sum2: "+sum2);
		
		//병렬처리 & Reduction
		Stream<Integer> numbers3 = Stream.of(1,2,3,4,5,6);
		Integer sum3 = numbers3.parallel().reduce(0, (total,n)->total+n);
		System.out.println("sum3: "+sum3);
		
	}

}
