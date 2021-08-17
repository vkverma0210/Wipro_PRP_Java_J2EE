import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentDigit {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();
        int input2 = scn.nextInt();
        int input3 = scn.nextInt();
        int input4 = scn.nextInt();

        MostFrequentDigit obj = new MostFrequentDigit();

        System.out.println(obj.mostFrequentDigit(input1, input2, input3, input4));

        scn.close();
    }

    public int mostFrequentDigit(int input1, int input2, int input3, int input4) {
        int[] inputs = { input1, input2, input3, input4 };
        int[] freq = new int[10];
        Arrays.fill(freq, 0);

        for (int num : inputs) {
            while (num != 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }

        int maxFreq = 0;

        for (int i = 0; i <= 9; i++) {
            if (freq[maxFreq] <= freq[i]) {
                maxFreq = i;
            }
        }

        return maxFreq;
    }
}
