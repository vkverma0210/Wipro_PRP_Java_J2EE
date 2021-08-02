import java.util.Scanner;

public class CharactersOrSumDigits {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        String input1 = scn.nextLine();
        int input2 = scn.nextInt();

        System.out.println(findCharsOrDigitSum(input1, input2));

        scn.close();
    }
    
    public String findCharsOrDigitSum(String input1, int input2)
    {
        
    }
}
