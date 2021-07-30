import java.util.Scanner;

/**
 * PosNegZero
 */
public class PosNegZero {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        
        if(num == 0)
        {
            System.out.println("Zero");
        }
        else if(num > 0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    }
}