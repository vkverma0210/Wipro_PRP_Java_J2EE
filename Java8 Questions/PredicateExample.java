import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        String arr[] = { "mumbai", "Delhi", "Pune", "Kolkata", "London", "Paris", "Pet" };

        Predicate<String> p1 = x -> x.length() > 3;
        Predicate<String> p2 = x -> x.startsWith("P");

        // Predicate And
        Arrays.stream(arr).filter(p1.and(p2)).forEach(System.out::println);
        System.out.println();

        // Predicate Or
        Arrays.stream(arr).filter(p1.or(p2)).forEach(System.out::println);
        System.out.println();

        // Predicate negate
        for (String city : arr) {
            if (p1.negate().test(city)) {
                System.out.println(city);
            }
        }
    }
}
