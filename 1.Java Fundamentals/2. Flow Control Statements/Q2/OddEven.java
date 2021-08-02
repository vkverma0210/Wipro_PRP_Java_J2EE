import java.util.Scanner;

public class OddEven {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scn.close();
    }
}
