import java.util.Scanner;

/**
 * test
 */
public class test {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        int n = scn.nextInt();

        int m = scn.nextInt();
        System.out.println(n + m);

        scn.close();
    }
}