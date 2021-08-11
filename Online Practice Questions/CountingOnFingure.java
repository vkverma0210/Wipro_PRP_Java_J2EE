import java.util.Scanner;

public class CountingOnFingure {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();

        CountingOnFingure obj = new CountingOnFingure();

        System.out.println(obj.countingOnFingure(input1));

        scn.close();
    }

    public int countingOnFingure(int input1) {
        int remen = input1 % 8;

        if (remen == 0) {
            return 2;
        }

        if (remen < 5) {
            return remen;
        } else {
            return (10 - remen);
        }
    }
}
