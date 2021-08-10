import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollect {
    public static void main(String[] args) {
        // Example 1 : Filtering even numbers
        List<Integer> al = new ArrayList<Integer>();

        al.add(3);
        al.add(8);
        al.add(9);

        List<Integer> li = al.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        System.out.println("Original List : " + al);
        System.out.println("Filtered List : " + li);

        // Example 2 : Filtering negative numbers
        List<Integer> al1 = new ArrayList<Integer>();

        al1.add(-3);
        al1.add(8);
        al1.add(-9);

        List<Integer> li1 = al1.stream().filter(x -> x < 0).collect(Collectors.toList());

        System.out.println("Original List : " + al1);
        System.out.println("Filtered List : " + li1);

        // Example 3 : Filtering on Strings
        List<String> al2 = new ArrayList<String>();
        al2.add("admin");
        al2.add("user");
        al2.add("customer");

        List<String> li2 = al2.stream().filter(s -> s.contains("e")).collect(Collectors.toList());
        System.out.println(li2);
    }
}
