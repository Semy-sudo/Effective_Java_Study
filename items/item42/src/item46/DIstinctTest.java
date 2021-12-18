package item46;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DIstinctTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("a","b","c","a","b");
		Stream<String> stream1 = strings.stream().distinct();
		stream1.forEach(System.out::println);

	}

}
