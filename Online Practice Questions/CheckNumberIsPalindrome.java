import java.util.Scanner;

/**
 * CheckNumberIsPalindrome
 */
public class CheckNumberIsPalindrome {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        CheckNumberIsPalindrome obj = new CheckNumberIsPalindrome();

        System.out.println(obj.isPalinNum(input1));

        scn.close();
    }

    public int isPalinNum(int input1) {
        int temp = input1;
        int reverse = 0;

        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (input1 == reverse) {
            return 2;
        } else {
            return 1;
        }
    }
}