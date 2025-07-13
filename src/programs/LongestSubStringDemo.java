package programs;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringDemo {

	public static void main(String[] args) {

		String s1 = "abbcd";
		longString(s1);

		String s2 = "abcdaefg";

		Result lengthOfSubString = lengthOfSubString(s2);
		System.out.println(lengthOfSubString);

	}

	private static Result lengthOfSubString(String s2) {

		int longestLength = 0;

		String output = null;

		for (int i = 0; i < s2.length(); i++) {

			StringBuilder s = new StringBuilder();

			for (int j = i; j < s2.length(); j++) {

				if (s.indexOf(String.valueOf(s2.charAt(j))) != -1) {
					break;
				}

				s.append(s2.charAt(j));

				if (s.length() > longestLength) {
					longestLength = s.length();
					output = s.toString();

				}

			}
		}

		return new Result(output, longestLength);

	}

	private static void longString(String s) {

		Map<Character, Integer> a = new HashMap<>();

		String subString = null;
		int length = 0;

		for (int i = 0; i < s.length(); i++) {

			if (!a.containsKey(s.charAt(i))) {
				a.put(s.charAt(i), i);
			} else {
				i = a.get(s.charAt(i));
				a.clear();
			}

			if (a.size() > length) {
				subString = a.keySet().toString();
				length = a.size();
			}
		}

		System.out.println("Longest SubString " + subString);
	}

	static class Result {
		String longSubstring;
		int length;

		public Result(String longSubstring, int length) {
			super();
			this.longSubstring = longSubstring;
			this.length = length;
		}

		@Override
		public String toString() {
			return "Result [longSubstring=" + longSubstring + ", length=" + length + "]";
		}
	}

}
