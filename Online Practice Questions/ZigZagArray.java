import java.util.Scanner;

public class ZigZagArray {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        ZigZagArray obj = new ZigZagArray();

        obj.zigZagArray(n, arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        scn.close();
    }

    public void zigZagArray(int n, int[] input2) {
        boolean flag = true;

        for (int i = 0; i <= n - 2; i++) {
            if (flag) {
                if (input2[i] > input2[i + 1]) {
                    int temp = input2[i];
                    input2[i] = input2[i + 1];
                    input2[i + 1] = temp;
                }
            } else {
                if (input2[i] < input2[i + 1]) {
                    int temp = input2[i];
                    input2[i] = input2[i + 1];
                    input2[i + 1] = temp;
                }
            }

            flag = !flag;
        }
    }
}
