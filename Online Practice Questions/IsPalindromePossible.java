import java.util.Arrays;
import java.util.Scanner;

public class IsPalindromePossible {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        IsPalindromePossible obj = new IsPalindromePossible();

        System.out.println(obj.isPalinNumPossible(input1));

        scn.close();
    }

    public int isPalinNumPossible(int input1) {
        int count[] = new int[10];

        Arrays.fill(count, 0);

        int temp = input1;

        while (temp != 0) {
            int rem = temp % 10;
            count[rem]++;
            temp /= 10;
        }

        int odd = 0;

        for (int i = 0; i < 10; i++) {
            if ((count[i] & 1) == 1) {
                odd++;
            }

            if (odd > 1) {
                return 1;
            }
        }

        return 2;
    }
}
