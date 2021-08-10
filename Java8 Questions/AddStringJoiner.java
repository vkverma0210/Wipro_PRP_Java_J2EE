import java.util.ArrayList;
import java.util.StringJoiner;

public class AddStringJoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",");
        s1.add("A");
        s1.add("B");
        System.out.println(s1);
        System.out.println();

        StringJoiner s2 = new StringJoiner(" , ", "{ ", " }");
        s2.add("A");
        s2.add("B");
        System.out.println(s2);
        System.out.println();

        StringJoiner s3 = new StringJoiner("-", "[", "]");
        s3.add("A");
        s3.add("B");
        System.out.println(s3);
        System.out.println();

        StringJoiner s4 = new StringJoiner(" and ");
        ArrayList<String> s5 = new ArrayList<String>();
        s5.add("Cricket");
        s5.add("football");
        s5.add("Chess");
        s5.forEach(element -> s4.add(element));
        System.out.println(s4);
        System.out.println();
    }
}
