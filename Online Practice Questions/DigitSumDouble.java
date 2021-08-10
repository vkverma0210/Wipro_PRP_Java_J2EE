import java.util.Scanner;

/**
 * DigitSumDouble
 */
public class DigitSumDouble {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        DigitSumDouble obj = new DigitSumDouble();

        System.out.println(obj.solution(input1));

        scn.close();
    }

    public int solution(int N) {
        int sum = 2 * sumOfDigit(N);
        int ans = 0;

        int i = N + 1;

        while (i != sum) {
            if (sum == sumOfDigit(i)) {
                ans = i;
                break;
            }

            i++;
        }

        return ans;
    }

    public int sumOfDigit(int N) {
        int sum = 0;

        while (N != 0) {
            int temp = N % 10;
            sum += temp;
            N /= 10;
        }

        return sum;
    }
}