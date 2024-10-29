package streamApiProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationExamples {
    public static void main(String[] args) {
    	System.out.println("1. ");
        // Stream.of(T... values)
        Stream<String> streamOfValues = Stream.of("a", "b", "c");
        streamOfValues.forEach(System.out::print);
        
        System.out.println(" ");
        System.out.println("2. ");
        // Stream.ofNullable(T t)
        Stream<String> streamOfNullable = Stream.ofNullable("a");
        streamOfNullable.forEach(System.out::print);
        
        System.out.println(" ");
        System.out.println("3. ");
        // Stream.empty()
        Stream<String> emptyStream = Stream.empty();
        
        System.out.println(" ");
        System.out.println("4. ");
        // Stream.iterate(T seed, UnaryOperator<T> f)
        Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 1);
        iterateStream.limit(5).forEach(System.out::print); // prints 1, 2, 3, 4, 5
        
        System.out.println(" ");
        System.out.println("5. ");
        // Stream.iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
        Stream<Integer> boundedIterateStream = Stream.iterate(1, n -> n < 10, n -> n + 1);
        boundedIterateStream.forEach(System.out::print); // prints 1 to 9
        
        System.out.println(" ");
        System.out.println("6. ");
        // Stream.generate(Supplier<T> s)
        Stream<Double> generatedStream = Stream.generate(Math::random).limit(3);
        generatedStream.forEach(System.out::print);
        
        System.out.println(" ");
        System.out.println("7. ");
        // Arrays.stream(T[] array)
        String[] array = {"a", "b", "c"};
        Stream<String> arrayStream = Arrays.stream(array);
        
        arrayStream.forEach(System.out::print);
        
        System.out.println(" ");
        System.out.println("8. ");
        // Collection.stream()
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();
        listStream.forEach(System.out::print);
    }
}
