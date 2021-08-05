import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CreatePIN {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();
        int input2 = scn.nextInt();
        int input3 = scn.nextInt();

        CreatePIN obj = new CreatePIN();

        System.out.println(obj.createPIN(input1, input2, input3));

        scn.close();
    }

    public int createPIN(int input1, int input2, int input3) {
        int[] input = { input1, input2, input3 };

        Integer[] ones = new Integer[3];
        Integer[] tens = new Integer[3];
        Integer[] huns = new Integer[3];

        int i = 0;
        for (int n : input) {
            ones[i] = n % 10;
            n /= 10;

            tens[i] = n % 10;
            n /= 10;

            huns[i] = n % 10;
            i++;
        }

        int onesMin = Collections.min(Arrays.asList(ones));
        int tensMin = Collections.min(Arrays.asList(tens));
        int hunsMin = Collections.min(Arrays.asList(huns));

        int onesMax = Collections.max(Arrays.asList(ones));
        int tensMax = Collections.max(Arrays.asList(tens));
        int hunsMax = Collections.max(Arrays.asList(huns));

        Integer[] Max = { onesMax, tensMax, hunsMax };

        int thous = Collections.max(Arrays.asList(Max));

        int ans = thous * 1000 + hunsMin * 100 + tensMin * 10 + onesMin;

        return ans;
    }
}
