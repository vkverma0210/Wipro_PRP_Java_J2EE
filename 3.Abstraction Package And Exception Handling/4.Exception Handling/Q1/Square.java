import java.util.Scanner;

public class Square {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        System.out.println("Enter an integer: - ");
        String str = scn.nextLine();

        try {
            int num = Integer.parseInt(str);
            System.out.println("The square is " + num * num);
            System.out.println("The work has been done successful");
        } catch (NumberFormatException e) {
            System.out.println("Entered input is not a valid format for an integer.");
        }

        scn.close();
    }
}
