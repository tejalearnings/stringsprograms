package programs;

public class ReverseVowelDemo {

	public String reverseVowels(String s) {
		if (s == null || s.length() <= 1)
			return s;

		char[] chars = s.toCharArray();
		int left = 0, right = s.length() - 1;

		while (left < right) {
			// Move left to the next vowel
			while (left < right && !isVowel(chars[left])) {
				left++;
			}
			// Move right to the previous vowel
			while (left < right && !isVowel(chars[right])) {
				right--;
			}
			// Swap the vowels
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			left++;
			right--;
		}

		return new String(chars);
	}

	private boolean isVowel(char c) {
		return "aeiouAEIOU".indexOf(c) != -1;
	}

	public static void main(String[] args) {
		ReverseVowelDemo rv = new ReverseVowelDemo();
		System.out.println(rv.reverseVowels("hello")); // Output: "holle"
		System.out.println(rv.reverseVowels("leetcode")); // Output: "leotcede"
	}
}
