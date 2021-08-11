import java.util.Scanner;

/**
 * StringWeight
 */
public class StringWeight {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        String str = scn.nextLine();

        int n = scn.nextInt();

        StringWeight obj = new StringWeight();

        System.out.println(obj.weightOfString(str, n));

        scn.close();
    }

    public int weightOfString(String input1, int input2) {
        int ans = 0;

        if (input2 == 0) {
            for (int i = 0; i < input1.length(); i++) {
                if ((input1.charAt(i) >= 'a') && (input1.charAt(i) <= 'z')) {
                    if ((input1.charAt(i) == 'a') || (input1.charAt(i) == 'e') || (input1.charAt(i) == 'i')
                            || (input1.charAt(i) == 'o') || (input1.charAt(i) == 'u')) {
                        continue;
                    } else {
                        ans += (input1.charAt(i) - 'a' + 1);
                    }
                } else if ((input1.charAt(i) >= 'A') && (input1.charAt(i) <= 'Z')) {
                    if ((input1.charAt(i) == 'A') || (input1.charAt(i) == 'E') || (input1.charAt(i) == 'I')
                            || (input1.charAt(i) == 'O') || (input1.charAt(i) == 'U')) {
                        continue;
                    } else {
                        ans += (input1.charAt(i) - 'A' + 1);
                    }
                }
            }
        } else if (input2 == 1) {
            for (int i = 0; i < input1.length(); i++) {
                if ((input1.charAt(i) >= 'a') && (input1.charAt(i) <= 'z')) {
                    ans += (input1.charAt(i) - 'a' + 1);
                } else if ((input1.charAt(i) >= 'A') && (input1.charAt(i) <= 'Z')) {
                    ans += (input1.charAt(i) - 'A' + 1);
                }
            }
        }

        return ans;
    }
}