import java.util.Scanner;

public class AddDigitOfNumbers {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        int input1 = scn.nextInt();
        int input2 = scn.nextInt();
        int input3 = scn.nextInt();
        int input4 = scn.nextInt();

        AddDigitOfNumbers obj = new AddDigitOfNumbers();

        System.out.println(obj.addDigitsOfNums(input1, input2, input3, input4));

        scn.close();
    }

    public int addDigitsOfNums(int input1, int input2, int input3, int input4) {
        int res = 0;
        int a = 0, b = 0, c = 0;

        if (input4 == 2) {
            a = input1 % 10;
            b = input2 % 10;
            c = input3 % 10;
        } else if (input4 == 1) {
            if (input1 < 10) {
                a = 1;
            } else {
                input1 /= 10;
                a = input1 % 10;
            }

            if (input2 < 10) {
                b = 1;
            } else {
                input2 /= 10;
                b = input2 % 10;
            }

            if (input3 < 10) {
                c = 1;
            } else {
                input3 /= 10;
                c = input3 % 10;
            }
        } else if (input4 == 0) {
            if (input1 < 100) {
                a = 2;
            } else {
                input1 /= 100;
                a = input1 % 10;
            }

            if (input2 < 100) {
                b = 2;
            } else {
                input2 /= 100;
                b = input2 % 10;
            }

            if (input3 < 100) {
                c = 2;
            } else {
                input3 /= 100;
                c = input3 % 10;
            }
        }

        res = a + b + c;
        return res;
    }
}
