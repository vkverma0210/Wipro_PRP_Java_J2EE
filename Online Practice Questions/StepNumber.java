import java.util.Scanner;

public class StepNumber {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        StepNumber obj = new StepNumber();

        System.out.println(obj.isStepNumber(input1));

        scn.close();
    }

    public String isStepNumber(int input1) {
        String str = Integer.toString(input1);
        boolean isStep = false;

        if (str.length() <= 1) {
            String ans = str + "-false";
            return ans;
        }

        for (int i = 1; i < str.length(); i++) {
            int curr = Integer.parseInt(String.valueOf(str.charAt(i)));
            int prev = Integer.parseInt(String.valueOf(str.charAt(i - 1)));

            if (((curr - prev) == 1) || ((curr - prev) == -1)) {
                isStep = true;
            } else {
                isStep = false;
                break;
            }
        }

        if (isStep) {
            String ans = str + "-true";
            return ans;
        } else {
            String ans = str + "-false";
            return ans;
        }
    }
}
