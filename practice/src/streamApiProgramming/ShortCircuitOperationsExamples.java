package streamApiProgramming;
import java.util.*;
import java.util.stream.*;

public class ShortCircuitOperationsExamples {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("1. ");
        // findFirst()
        data.stream().findFirst().ifPresent(System.out::println); // apple
        System.out.println("2. ");
        // findAny()
        data.stream().findAny().ifPresent(System.out::println);
        System.out.println("3. ");
        // anyMatch(Predicate<T> predicate)
        boolean hasApple = data.stream().anyMatch(s -> s.equals("apple"));
        System.out.println("Has Apple: " + hasApple);
        System.out.println("4. ");
        // limit(long maxSize)
        data.stream().limit(2).forEach(System.out::println); // apple, banana
    }
}

