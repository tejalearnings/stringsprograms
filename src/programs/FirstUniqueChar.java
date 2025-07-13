package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueChar {

	public static void main(String[] args) {

		String s = "helloworld";
		char[] charArray = s.toCharArray();
		System.out.println(charArray);

		// First Unique key
		String key = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
		System.out.println(key);

		// First Duplicate key
		String dup = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() > 1).findFirst().get().getKey();
		System.out.println(dup);

		LinkedHashMap<String, Long> collect = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		System.out.println(collect);

	}

}
