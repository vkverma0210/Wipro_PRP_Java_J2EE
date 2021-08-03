import java.util.Scanner;

public class ModifiedArraySum {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input2 = scn.nextInt();

        int[] input1 = new int[input2];

        for (int i = 0; i < input2; i++) {
            input1[i] = scn.nextInt();
        }

        ModifiedArraySum obj = new ModifiedArraySum();

        System.out.println(obj.reducedArrCount(input1, input2));

        scn.close();
    }

    public int reducedArrCount(int[] input1, int input2) {
        if (input2 % 2 == 0) {
            for (int i = 0; i < input2; i += 2) {
                input1[i] = 0;
            }
        } else {
            for (int i = 1; i < input2; i += 2) {
                input1[i] = 1;
            }
        }

        int sum = 0;

        for (int i = 0; i < input2; i++) {
            sum += input1[i];
        }

        // int res = (sum - 1) % 9 + 1;
        // return res;

        while (sum >= 10) {
            int temp = 0;

            while (sum != 0) {
                int rem = sum % 10;
                temp += rem;
                sum = sum / 10;
            }

            sum = temp;
        }

        return sum;
    }
}
