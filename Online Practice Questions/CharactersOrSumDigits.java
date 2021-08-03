import java.util.Scanner;

public class CharactersOrSumDigits {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.nextLine();
        int input2 = scn.nextInt();

        CharactersOrSumDigits obj = new CharactersOrSumDigits();

        System.out.println(obj.findCharsOrDigitSum(input1, input2));

        scn.close();
    }

    public String findCharsOrDigitSum(String input1, int input2) {
        int len = input1.length();

        if (len == 0) {
            return "NULL";
        }

        int ans = 0;
        String res = "";

        if (input2 == 0) {
            for (int i = 0; i < len; i++) {
                if (Character.isDigit(input1.charAt(i)) == true) {
                    ans += Integer.parseInt(String.valueOf(input1.charAt(i)));
                }
            }

            if (ans == 0) {
                return "ZERO";
            } else {
                return String.valueOf(ans);
            }
        } else {
            for (int i = 0; i < len; i++) {
                if (Character.isDigit(input1.charAt(i)) == false) {
                    res += input1.charAt(i);
                }
            }

            if (res.length() == 0) {
                return "ZERO";
            } else {
                return res;
            }
        }
    }
}
