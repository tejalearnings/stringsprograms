package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamCodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15);

		int[] list1 = { 10, 15, 8, 49, 25, 98, 32, 15 };

		// filter only even
		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
		System.out.println();

		System.out.println("Number start with 1");
		// find number starting with 1

		list.stream().map(x -> x + "").filter(x -> x.startsWith("1")).forEach(x -> System.out.print(x + " "));
		System.out.println();

		System.out.println("Duplicate Numbers in given list");
		Set<Integer> set = new HashSet();

		list.stream().filter(x -> !set.add(x)).forEach(System.out::println);
	}

}
