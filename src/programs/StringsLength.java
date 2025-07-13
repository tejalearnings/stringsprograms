package programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsLength {
	// output j -1 m-2 s-1
	public static void main(String[] args) {
		List<String> n = Arrays.asList("java", "spring", "maven", "microservices");

		Map<Character, Long> collect = n.stream()
				.collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));

		System.out.println(collect);

		// need words size greater than 5

		Map<Character, Long> collect2 = n.stream().filter(x -> x.length() > 5)
				.collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
		System.out.println(collect2);

		Map<Character, List<String>> collect3 = n.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));

		System.out.println(collect3);

		List<Integer> s = Arrays.asList(3, 4, 5, 3, 5);

		Integer map = s.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).findFirst().get();

		System.out.println(map);
	}

}
