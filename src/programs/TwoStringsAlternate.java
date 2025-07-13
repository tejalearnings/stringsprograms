package programs;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoStringsAlternate {

	public static void main(String[] args) {

//		String s1 = "india";
//		String s2 = "1234567";
//
//		o/p i1n2d3i4a567

		String s1 = "india";
		String s2 = "1234567";

		int min = Math.min(s1.length(), s2.length());
		int max = Math.max(s1.length(), s2.length());

		StringBuilder s = new StringBuilder();

		for (int i = 0; i < min; i++) {
			s.append(s1.charAt(i));
			s.append(s2.charAt(i));

		}

		if (s1.length() > min) {
			s.append(s1.substring(min));
		}
		if (s2.length() > min) {
			s.append(s2.substring(min));
		}

		System.out.println(s);

		// Using java stream

		String collect = IntStream.range(0, max).mapToObj(i -> {
			StringBuilder sb = new StringBuilder();

			if (i < s1.length()) {
				sb.append(s1.charAt(i));
			}

			if (i < s2.length()) {
				sb.append(s2.charAt(i));

			}

			return sb.toString();
		}).collect(Collectors.joining());

		System.out.println(collect);
	}

}
