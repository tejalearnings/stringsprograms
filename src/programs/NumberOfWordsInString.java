package programs;

public class NumberOfWordsInString {

	public static void main(String[] args) {

		String s = "akshitha is mental girl in this world";

		String str[] = s.split(" ");
		System.out.println(str.length);

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

		}

	}

}
