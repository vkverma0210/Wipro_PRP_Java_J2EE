import java.util.Scanner;

public class GreatestNumberInArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }

        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < n; i++)
        {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        
        System.out.println(ans);
    }
}
