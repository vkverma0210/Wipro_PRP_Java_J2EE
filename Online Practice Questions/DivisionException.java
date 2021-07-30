import java.util.Scanner;

class InvalidDivisor extends Exception {
    public String getMessage() {
        return "The division operation can notbe done as the divisor is 0";
    }
}

class Division {
    int x;
    int y;

    Division(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int divide(int x, int y) {
        int ans = x / y;
        return ans;
    }
}

public class DivisionException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scn.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scn.nextInt();

        Division d1 = new Division(x, y);

        try {
            if (y == 0) {
                throw new InvalidDivisor();
            } else {
                int ans = d1.divide(x, y);
                System.out.println("Answer: " + ans);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You...!");
        }
    }
}
