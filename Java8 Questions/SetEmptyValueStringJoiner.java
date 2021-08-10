import java.util.StringJoiner;

public class SetEmptyValueStringJoiner {
    public static void main(String[] args) {
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        System.out.println("Starting Length : " + s1.length());
        s1.setEmptyValue("Empty");
        System.out.println("s1 : " + s1);
        System.out.println("New Length 1 : " + s1.length());
        s1.add("Hello");
        System.out.println("s1 : " + s1);
        System.out.println("New Length 2 : " + s1.length());
    }
}
