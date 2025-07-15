package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ReverseVowelUsingList {

	public String reverseVowels(String s) {
		List<Character> vowels = new LinkedList<>();
		Set<Character> vowelSet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

		// Step 1: Store all vowels
		for (char c : s.toCharArray()) {
			if (vowelSet.contains(c)) {
				vowels.add(c);
			}
		}

		// Step 2: Reconstruct the string with reversed vowels
		StringBuilder result = new StringBuilder();
		int vowelIndex = vowels.size() - 1;

		for (char c : s.toCharArray()) {
			if (vowelSet.contains(c)) {
				result.append(vowels.get(vowelIndex--)); // use vowels in reverse order
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		ReverseVowelUsingList rv = new ReverseVowelUsingList();
		System.out.println(rv.reverseVowels("hello")); // holle
		System.out.println(rv.reverseVowels("leetcode")); // leotcede
	}
}
