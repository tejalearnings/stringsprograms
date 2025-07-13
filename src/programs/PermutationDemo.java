package programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PermutationDemo {
	public static void main(String[] args) {
		String str = "abc";
		permutations(str).forEach(System.out::println);
	}

	public static Stream<String> permutations(String str) {
		if (str.isEmpty()) {
			return Stream.of("");
		}
		return IntStream.range(0, str.length()).boxed()
				.flatMap(i -> permutations(str.substring(0, i) + str.substring(i + 1)).map(t -> str.charAt(i) + t));
	}
}
