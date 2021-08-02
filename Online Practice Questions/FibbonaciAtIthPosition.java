import java.util.Scanner;

public class FibbonaciAtIthPosition {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        System.out.println(findResult(input1));

        scn.close();
    }

    public static int findResult(int input1) {
        int first = 0;
        int second = 1;
        int third = 0;
        int count = 2;
        if (input1 == 0) {
            return 1;
        }

        if (input1 == 1) {
            return 2;
        }

        while (third < input1) {
            third = first + second;
            first = second;
            second = third;
            count++;
        }

        return count;
    }

}
