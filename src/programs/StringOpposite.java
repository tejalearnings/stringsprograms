package programs;

import java.util.stream.Collectors;

public class StringOpposite {

	public static void main(String[] args) {
		String str = "Akhil";
		char c[] = str.toCharArray();

		System.out.println(c);
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i] + 32);
				System.out.print(c[i]);
			} else if (c[i] >= 97 && c[i] <= 122) {
				c[i] = (char) (c[i] - 32);
				System.out.print(c[i]);
			}
		}

		str.chars().mapToObj(x -> (char) x)
				.map(x -> str.indexOf(x) == 0 ? Character.toLowerCase(x) : Character.toUpperCase(x))
				.map(String::valueOf).collect(Collectors.joining());

	}

}
