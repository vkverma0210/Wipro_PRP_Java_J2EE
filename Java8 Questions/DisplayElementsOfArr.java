import java.util.Arrays;
import java.util.List;

public class DisplayElementsOfArr {
    public static void main(String[] args) {
        Integer arr[] = new Integer[] { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(arr);

        // Before Java 8, to display all elements from List
        for (Integer o : list) {
            System.out.println(o + " ");
        }

        // In Java 8, Using Lambda Expression
        list.forEach((Integer o) -> System.out.println(o));

        // In Java 8, Using Method Reference
        list.forEach(System.out::println);
    }
}
