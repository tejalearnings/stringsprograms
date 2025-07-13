package programs;

import java.util.stream.Collectors;

public class RegexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hel34lo123";

		String collect = s.chars().mapToObj(x -> (char) x).filter(x -> Character.isAlphabetic(x)).map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(collect);

		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))) {
				s2.append(s.charAt(i));
			}

		}

		System.out.println(s2.toString());
	}

}
