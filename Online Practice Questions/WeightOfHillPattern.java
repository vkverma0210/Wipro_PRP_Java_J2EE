import java.util.Scanner;

public class WeightOfHillPattern {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();
        int input2 = scn.nextInt();
        int input3 = scn.nextInt();

        WeightOfHillPattern obj = new WeightOfHillPattern();

        System.out.println(obj.totalHillWeight(input1, input2, input3));

        scn.close();
    }

    public int totalHillWeight(int input1, int input2, int input3) {
        int ans = 0;
        int k = input2;

        for (int i = 1; i <= input1; i++) {
            for (int j = 1; j <= i; j++) {
                ans += k;
            }

            k += input3;
        }

        return ans;
    }
}
