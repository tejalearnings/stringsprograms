package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfString {

	public static void main(String[] args) {

		String name = "jayateja";

		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			if (count.containsKey(name.charAt(i))) {
				count.put(name.charAt(i), count.get(name.charAt(i)) + 1);
			} else {
				count.put(name.charAt(i), 1);
			}

		}
		System.out.println(count);
		System.out.print("Duplicate ELements in given array" + " : ");

		for (Entry<Character, Integer> a : count.entrySet()) {

			if (a.getValue() > 1)
				System.out.print(a.getKey() + " ");

		}
		System.out.println();
		System.out.print("Unique ELements in given array" + " : ");

		for (Map.Entry<Character, Integer> a : count.entrySet()) {

			if (a.getValue() == 1)
				System.out.print(a.getKey() + " ");

		}
		System.out.println();

		// Java 8
		// Char Occurence in jayateja word

		Map<String, Long> collect = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		// Duplicate elements in word jayateja

		List<String> collect2 = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(collect2);

		// Unique elements in word jayateja

		List<String> collect3 = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(collect3);

		List<Entry<String, Long>> collect4 = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).collect(Collectors.toList());

		System.out.println(collect4);

	}

}
