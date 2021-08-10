import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        // Example 1 : Printing 10 numbers by skipping one value
        Stream.iterate(0, n -> n + 2).limit(10).forEach(System.out::println);
        System.out.println();

        // Example 2 : Printing first 10 odd numbers
        Stream.iterate(1, n -> n + 1).filter(n -> n % 2 != 0).limit(10).forEach(System.out::println);
    }
}
