import java.util.ArrayList;
import java.util.List;

public class FilterAndCountMaxMinDemo {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(8);
        al.add(9);

        long c = al.stream().filter(x -> x % 2 == 0).count();

        System.out.println(c);

        int ma = al.stream().max((x, y) -> x > y ? 1 : -1).get();
        System.out.println(ma);

        int mi = al.stream().min((x, y) -> x > y ? 1 : -1).get();
        System.out.println(mi);
    }
}
