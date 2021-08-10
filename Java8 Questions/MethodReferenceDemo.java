import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        String[] myArray1 = { "Anitha", "Valan", "Yuvashree", "manoj", "Sureka", "sahithi", "Sirish" };
        String[] myArray2 = { "Anitha", "Valan", "Yuvashree", "manoj", "Sureka", "sahithi", "Sirish" };

        // using instance method of an arbitrary object of a particular type
        Arrays.sort(myArray1, String::compareToIgnoreCase);
        for (String name : myArray1) {
            System.out.println(name);
        }

        // without instance method of an arbitrary object of a particular type
        System.out.println("*******************");
        Comparator<String> stringComparator = (first, second) -> first.compareToIgnoreCase(second);
        Arrays.sort(myArray2, stringComparator);
        for (String name : myArray2) {
            System.out.println(name);
        }
    }
}
