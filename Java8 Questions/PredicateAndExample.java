import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateAndExample {
    public static void main(String[] args) {
        String arr[] = { "mumbai", "Delhi", "Pune", "Kolkata", "London", "Paris", "Pet" };

        Predicate<String> p1 = x -> x.length() > 3;
        Predicate<String> p2 = x -> x.startsWith("P");

        Arrays.stream(arr).filter(p1.and(p2)).forEach(System.out::println);
    }
}
