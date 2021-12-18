package item45;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Anagrams {

	public static void main(String[] args) {
		List<String> dictionary = Arrays.asList("Dormitory", "Dirty Room", "Hot water", "Worth tea");
		dictionary.stream()
        .collect(groupingBy(word -> word.chars().sorted()
                        .collect(StringBuilder::new,
                                (sb, value) -> sb.append((char)value),
                                StringBuilder::append).toString()))
        .values().stream()
        .filter(group -> group.size() >= 2)
        .map(group -> group.size() +": " + group)
        .forEach(System.out::println);
	}

}
