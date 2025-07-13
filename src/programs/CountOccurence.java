package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {

	public static void main(String[] args) {

		String s = "Jayateja";

		Map<Character, Long> collect2 = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect2);

		Map<Character, Long> collect1 = s.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));

		System.out.println(collect1);

		// CountOccurence

		Map<String, Long> collect = Arrays.stream(s.split("")).map(x -> x.toLowerCase())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect);

		// Program to find count occurence of given character in a string
		char c = 'a';

		int frequency = Collections.frequency(Arrays.asList(s.split("")), String.valueOf(c));
		System.out.println(frequency);

		List<String> asList = Arrays.asList("9");

	}
}
