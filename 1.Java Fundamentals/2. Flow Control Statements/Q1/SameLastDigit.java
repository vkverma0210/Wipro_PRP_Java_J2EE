import java.util.Scanner;

public class SameLastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        if((num1 % 10) == (num2 % 10))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
