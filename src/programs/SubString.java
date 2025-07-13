package programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubString {

	public static void main(String[] args) {

		String s1 = "divya is bad girl";

		String[] split = s1.split(" ");

		String updatedString = new String();

		for (int i = 0; i <= split.length; i++) {
			String s = split[0].substring(0, 1);
			updatedString = updatedString + s;

		}

		String upperCase = s1.toUpperCase();

		// System.out.println(upperCase);

		// Method 2

		int length = s1.length();

		String collect = IntStream.range(0, length).mapToObj(i -> {
			StringBuilder sb = new StringBuilder();

			sb.append(s1.charAt(i));

			return sb.toString().toUpperCase();
		}).collect(Collectors.joining());

		// System.out.println(collect);

		String collect2 = Arrays.stream(s1.split("")).map(x -> x.toUpperCase()).collect(Collectors.joining());
		System.out.println(collect2);
	}

}
