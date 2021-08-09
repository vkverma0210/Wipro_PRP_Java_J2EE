import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * ConsumerInterface
 */
public class ConsumerInterface {

    public static void main(String[] args) {
        // Consumer<Integer> c1 = i -> System.out.println(i);

        // List<Integer> li = new ArrayList<Integer>();
        // li.add(10);
        // li.add(20);

        // li.forEach(n -> c1.accept(n));

        // Consumer<List<Integer>> c2 = list -> {
        // for (int j = 0; j < list.size(); j++) {
        // list.set(j, 2 * list.get(j));
        // }
        // };

        // List<Integer> li = new ArrayList<Integer>();
        // li.add(10);
        // li.add(20);

        // c2.accept(li);

        // li.forEach(n -> c1.accept(n));

        Consumer<String> c1 = i -> System.out.println(i);
        Consumer<String> c2 = c1.andThen(i -> System.out.println(" -> Hello " + i));

        List<String> li = new ArrayList<String>();

        li.add("Admin");
        li.add("User");

        li.forEach(n -> c2.accept(n));

    }
}