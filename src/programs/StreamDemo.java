package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("mango", "apple", "banana", "apple");

		Map<Character, Long> collect = fruits.stream()
				.collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));

		System.out.println(collect);

	}

}
