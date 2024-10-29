package practicequestions;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//Q1: Given a list of integers, return a list containing only even numbers using Java 8 Streams.
//Q2: Convert a list of strings to a list of their lengths using the map function in streams.
//Q3: Find the sum of all integers in a list using Java 8 Streams.
//Q4: How would you find the maximum number in a list of integers using Java 8 Streams?
//Q5: Given a list of strings, return a list with all elements in uppercase using Java 8 Streams.
//Q6: Write a lambda expression that takes two integers and returns their product.
//Q7: Using lambdas, write a function to sort a list of Person objects (where Person has name and age fields) by age.
//Q8: Write a lambda that filters a list of strings and returns those starting with the letter "A".
public class ReturnEvenNumbers {
	public static void main(String[] args) {
//		1.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		 numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		  List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple");
//		2. 
		  Map<Object, Long> wordLengths=
				  words.stream().collect(groupingBy(s -> s, counting()));
		  System.out.println(wordLengths);
//		  3.
		 int sum= numbers.stream().reduce(0,Integer::sum);
		  System.out.println(sum);
//		  4.
		  numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
//		  5.
		  words.stream().map(s->s.toUpperCase()).forEach(System.out::println);
//		  6.
		  BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
		    int result = multiply.apply(5, 3);
		    System.out.println(result);
//		  7.
		    
		List<Person> people = Arrays.asList(
		            new Person("Alice", 30),
		            new Person("Bob", 25),
		            new Person("Charlie", 35)
		        );
		    people.sort((p1,p2)->Integer.compare(p1.getAge(), p2.getAge()));
		    people.forEach(System.out::println);
		    
		    words.stream().filter(f->f.startsWith("a")).forEach(System.out::println);
		    
	}
}
