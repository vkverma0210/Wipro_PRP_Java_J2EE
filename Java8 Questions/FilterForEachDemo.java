import java.util.ArrayList;
import java.util.List;

public class FilterForEachDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(5);
        al.add(6);
        al.add(8);

        al.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.print(x + " "));
    }
}
