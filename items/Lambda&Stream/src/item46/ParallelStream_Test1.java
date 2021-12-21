package item46;

import java.util.Arrays;
import java.util.List;

public class ParallelStream_Test1 {

	public static void main(String[] args) {
		List<Integer> listOfNumbers = Arrays.asList(1,2,3,4);
		//parallelStream()
		int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
		System.out.println(sum);
		
		//stream()
//		int sum = listOfNumbers.stream().reduce(5, Integer::sum);
//		System.out.println(sum);
		
		
	}

}
