package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordInString {

	public static void main(String[] args) {

		duplicateWordCountFind("Hello World Hello Earth");

	}

	private static void duplicateWordCountFind(String s) {

		String[] words = s.split(" ");

		Map<String, Integer> wordCount = new HashMap<>();

		for (String s1 : words) {
			if (wordCount.containsKey(s1)) {
				wordCount.put(s1, wordCount.get(s1) + 1);
			} else {
				wordCount.put(s1, 1);
			}

		}

		Set<String> keySet = wordCount.keySet();

		for (String s2 : keySet) {
			if (wordCount.get(s2) > 1) {
				System.out.println(s2 + " : " + wordCount.get(s2));
			}
		}

	}

}
