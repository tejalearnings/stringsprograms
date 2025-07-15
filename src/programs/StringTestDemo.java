package programs;

public class StringTestDemo {

	public static void main(String[] args) {

		String s = "joyateja";

		int indexOf = "aeiouAEIOU".indexOf(s.charAt(1));
		System.out.println(indexOf);

		int indexOf2 = s.lastIndexOf('e');
		System.out.println(indexOf2);

	}

}
