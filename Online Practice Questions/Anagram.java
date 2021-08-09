import java.util.Scanner;

public class Anagram {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.next();
        String input2 = scn.next();

        Anagram obj = new Anagram();

        System.out.println(obj.isAnagram(input1, input2));

        scn.close();
    }

    public boolean isAnagram(String input1, String input2) {
        int len1 = input1.length();
        int len2 = input1.length();

        if (len1 != len2) {
            return false;
        }

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        int arr[] = new int[26];

        for (int i = 0; i < len1; i++) {
            arr[input1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len2; i++) {
            arr[input2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
