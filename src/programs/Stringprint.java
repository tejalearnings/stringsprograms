package programs;

public class Stringprint {

	public static void main(String[] args) {
		String str = "Akhil123";

		char c[] = str.toCharArray();
		for (int i = 0; i < c.length; i++) {

			if (c[i] >= 65 && c[i] <= 90 || c[i] >= 97 && c[i] <= 122) {
				System.out.print(c[i]);
			}
		}

	}

}
