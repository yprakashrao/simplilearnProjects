package streamApiProgramming;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class CollectorsExamples {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple");

        // Collectors.groupingBy
        Map<String, Long> grouped = words.stream()
            .collect(groupingBy(s -> s, counting()));
        System.out.println("1. Grouped: " + grouped); // {apple=3, banana=2, cherry=1}

        // Collectors.partitioningBy
        Map<Boolean, List<String>> partitioned = words.stream()
            .collect(partitioningBy(s -> s.startsWith("a")));
        System.out.println("2. Partitioned: " + partitioned);

        // Collectors.joining
        String joined = words.stream()
            .collect(joining(", ", "[", "]"));
        System.out.println("3. Joined: " + joined); // [apple, banana, cherry, apple, banana, apple]

        // Collectors.toMap
        Map<String, Integer> wordLengths = words.stream()
            .distinct()
            .collect(toMap(s -> s, String::length));
        System.out.println("4. Word Lengths: " + wordLengths);
    }
}
