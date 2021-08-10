import java.util.ArrayList;

public class ArrayListLambdaTest {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // Using lambda expression to print all elements
        System.out.println("Printing All Elements: ");
        list1.forEach(n -> System.out.print(n + " "));
        System.out.println();

        // Using lambda expression to print even numbers
        System.out.println("Printing All Elements: ");
        list1.forEach(n -> {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        });
    }
}
