import java.util.Scanner;

public class String2ndWordToUpper {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.nextLine();

        String2ndWordToUpper obj = new String2ndWordToUpper();
        
        System.out.println(obj.secondWordUpperCase(input1));

        scn.close();
    }

    public String secondWordUpperCase(String input1) {
        String[] str = input1.split(" ", 0);

        if (str.length == 1) {
            return "LESS";
        }

        String ans = "";

        ans = str[1].toUpperCase();

        return ans;
    }
}
