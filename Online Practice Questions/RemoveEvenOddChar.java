import java.util.Scanner;

/**
 * RemoveEvenOddChar
 */
public class RemoveEvenOddChar {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.nextLine();

        RemoveEvenOddChar obj = new RemoveEvenOddChar();

        System.out.println(obj.reducedString(input1));

        scn.close();
    }

    public String reducedString(String input1) {
        int n = input1.length();

        char[] temp = new char[n / 2 + 1];

        int j = 1;
        temp[0] = input1.charAt(0);

        if (n % 2 == 0) {
            for (int i = 1; i < n; i += 2) {
                temp[j++] = input1.charAt(i);
            }
        } else {
            for (int i = 2; i < n; i += 2) {
                temp[j++] = input1.charAt(i);
            }
        }

        return String.valueOf(temp);
    }
}