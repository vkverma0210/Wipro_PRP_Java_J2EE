import java.util.StringJoiner;

public class MergeStringJoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        s1.add("A");
        s1.add("B");
        System.out.println("s1 : " + s1);
        System.out.println();

        StringJoiner s2 = new StringJoiner("-", "(", ")");
        s2.add("1");
        s2.add("2");
        System.out.println("s2 : " + s2);
        System.out.println();
        s1.merge(s2);
        System.out.println("s1 : " + s1);
    }
}
