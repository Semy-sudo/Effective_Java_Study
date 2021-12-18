package item44;

import java.util.Arrays;
import java.util.List;

public class StreamRamda {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1","a2","a3","a4");
		myList.stream()
			.filter(s -> s.startsWith("c"));

	}

}
