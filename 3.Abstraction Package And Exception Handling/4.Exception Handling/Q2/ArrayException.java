import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter na integer: - ");
        String str = scn.nextLine();

        try{
            int num = Integer.parseInt(str);
            System.out.println("The square is " + num * num);
            System.out.println("The work has been done successful");
    }
}
