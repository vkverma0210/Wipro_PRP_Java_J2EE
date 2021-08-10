import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("wipro");
        li.add("technologies");
        li.add("chennai");
        li.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> li2 = li.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(li2);
    }
}
