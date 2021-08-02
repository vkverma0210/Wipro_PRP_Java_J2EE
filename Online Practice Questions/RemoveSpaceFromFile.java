import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoveSpaceFromFile {
    private static Scanner scn;

    public static void main(String[] args) throws IOException {
        scn = new Scanner(System.in);
        File f;
        FileWriter fw = new FileWriter("Output.txt");

        try {
            f = new File("Input.txt");
            scn = new Scanner(f);

            String[] str = scn.nextLine().split(" ", 0);

            for (String word : str) {
                fw.write(word);
            }

            System.out.println("Write Success...!");

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found...!");
        }

        fw.close();
        scn.close();
    }
}
