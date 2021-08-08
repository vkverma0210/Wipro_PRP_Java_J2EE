import java.util.Scanner;

/**
 * IsStringPalindrome
 */
public class IsStringPalindrome {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.nextLine();

        IsStringPalindrome obj = new IsStringPalindrome();

        System.out.println(obj.isPalindrome(input1));

        scn.close();
    }

    public int isPalindrome(String input1) {
        int len = input1.length() - 1;
        int i = 0;

        String str = input1.toLowerCase();

        while (i < len) {
            if (str.charAt(i) != str.charAt(len)) {
                return 1;
            }

            i++;
            len--;
        }

        return 2;
    }
}