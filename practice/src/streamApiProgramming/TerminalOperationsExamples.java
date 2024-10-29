package streamApiProgramming;
import java.util.*;
import java.util.stream.*;

public class TerminalOperationsExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        System.out.println("");
        System.out.println("1. ");
        // forEach(Consumer<T> action)
        numbers.stream().forEach(System.out::println);
        
        System.out.println("");
        System.out.println("2. ");
        // reduce(BinaryOperator<T> accumulator)
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);
        
        System.out.println("");
        System.out.println("3. ");
        // collect(Collector<T, A, R> collector)
        List<Integer> collectedList = numbers.stream().collect(Collectors.toList());
        System.out.println("Collected List: " + collectedList);
        
        System.out.println("");
        System.out.println("4. ");
        // min(Comparator<? super T> comparator)
        numbers.stream().min(Integer::compareTo).ifPresent(System.out::println);
        
        System.out.println("");
        System.out.println("5. ");
        // count()
        long count = numbers.stream().count();
        System.out.println("Count: " + count);
        
        System.out.println("");
        System.out.println("6. ");
        // anyMatch(Predicate<T> predicate)
        boolean hasEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Has Even: " + hasEven);
    }
}

