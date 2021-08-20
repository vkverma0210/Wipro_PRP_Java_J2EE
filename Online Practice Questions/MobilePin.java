import java.util.Scanner;

public class MobilePin {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.next();
        String input2 = scn.next();

        MobilePin obj = new MobilePin();

        System.out.println(obj.findMobilePin(input1, input2));

        scn.close();
    }

    public int findMobilePin(String input1, String input2) {
        String s1 = input1.toLowerCase();
        String s2 = input2.toLowerCase();

        int a1[] = new int[26];
        int a2[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            a1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            a2[s2.charAt(i) - 'a']++;
        }

        int ans1 = 0;
        int ans2 = 0;
        int count = 0;

        for (int i = 0; i < 26; i++) {
            if ((a1[i] > 0) && (a2[i] > 0)) {
                a1[i] = 0;
                a2[i] = 0;
                count++;
            }

            if (a1[i] > 1) {
                a1[i] = 0;
            }

            if (a2[i] > 1) {
                a2[i] = 0;
            }

            if (a1[i] > 0) {
                ans1 = ans1 + i + 1;
            }

            if (a2[i] > 0) {
                ans2 = ans2 + i + 1;
            }
        }

        String temp = "" + count + ans1 + ans2;

        int res = Integer.parseInt(temp);

        return res;
    }
}
