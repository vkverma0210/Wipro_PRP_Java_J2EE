import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberFromFile {
    private static Scanner scn;

    public static void main(String[] args) throws IOException {
        // Write to file
        FileWriter fw = new FileWriter("Number.txt");

        Random x = new Random();

        int num = 1;
        int i = 0;

        while (i < 30) {
            int temp = x.nextInt(31);

            if (temp > 0) {
                num = temp;
                fw.write(num + "\n");
                i++;
            }
        }

        System.out.println("Written Successfully.");
        fw.close();

        double sum = 0;

        File f;

        try {
            f = new File("Number.txt");
            scn = new Scanner(f);

            for (i = 0; i < 10; i++) {
                sum += Integer.parseInt(scn.nextLine());
            }

            System.out.println("Sum of Numbers: " + sum + "\nAverage of Numbers: " + sum / 10);

            scn.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found...!");
        }
    }
}
