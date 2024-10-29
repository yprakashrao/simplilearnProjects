package streamApiProgramming;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperationsExamples {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("apple", "banana", "cherry", "apple", "cherry");
		System.out.println("1. ");
		// filter(Predicate<T> predicate)
		data.stream().filter(s -> s.startsWith("a")).forEach(System.out::println); // apple, apple

		System.out.println("2. ");
		// map(Function<T, R> mapper)
		data.stream().map(String::toUpperCase).sorted().forEach(System.out::println); // APPLE, BANANA, CHERRY, APPLE,
																						// CHERRY
		System.out.println("3. ");
		// distinct()
		data.stream().distinct().forEach(System.out::println); // apple, banana, cherry

		System.out.println("4. ");
		// sorted()
		data.stream().sorted().forEach(System.out::println); // apple, apple, banana, cherry, cherry

		System.out.println("5. ");

		long count = data.stream().peek(System.out::println) // Peek will now print each element
				.count(); // count() is terminal, but does not consume the elements visibly

		System.out.println("Count: " + count);
	}
}
