package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondHighNum {

	public static void main(String[] args) {

		int[] numbers = { 5, 6, 8, 32, 31 };

		Optional<Integer> findFirst = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1)
				.findFirst();

		System.out.println(findFirst.get());

	}

}
