import java.util.ArrayList;
import java.util.List;

public class ExampleForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");

        // Iterating with forEach by Passing lamdaExpression
        // list.forEach(l1 -> System.out.println(l1));

        // Iterating through method reference
        list.forEach(System.out::println);
    }
}
