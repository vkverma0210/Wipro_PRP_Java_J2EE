import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        scn.close();
    }
}
