import java.util.Scanner;

/**
 * Fibonacciseries
 */
public class Fibonacciseries {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        Fibonacciseries obj = new Fibonacciseries();

        System.out.println(obj.nthFibonacci(input1));

        scn.close();
    }

    public long nthFibonacci(int input1) {
        int first = 0;
        int second = 1;
        int third = 0;

        if (input1 == 1) {
            return first;
        }

        if (input1 == 2) {
            return second;
        }

        for (int i = 3; i <= input1; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}