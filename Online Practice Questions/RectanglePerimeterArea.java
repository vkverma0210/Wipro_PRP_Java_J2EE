import java.util.Scanner;

class Rectangle {
    float length;
    float height;

    Rectangle(float length, float height) {
        this.length = length;
        this.height = height;
    }

    public void calPerimeter(float length, float height) {
        float perimeter = 0;
        try {
            perimeter = 2 * (length + height);

            if (length < 0 || height < 0) {
                throw new Exception();
            } else {
                System.out.println("Perimeter: " + perimeter);
            }
        } catch (Exception e) {
            System.out.println("Enter the valid values for perimeter.");
        } finally {
            System.out.println("Thank you...!");
        }
    }

    void calArea(float length, float height) {
        float area = 0;
        try {
            area = length * height;

            if (length < 0 || height < 0) {
                throw new Exception();
            } else {
                System.out.println("Perimeter: " + area);
            }
        } catch (Exception e) {
            System.out.println("Enter the valid values for area.");
        } finally {
            System.out.println("Thank you...!");
        }
    }
}

public class RectanglePerimeterArea {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);

        System.out.print("Enter the length: ");
        float length = scn.nextFloat();

        System.out.print("Enter the height: ");
        float height = scn.nextFloat();

        Rectangle r1 = new Rectangle(length, height);
        r1.calPerimeter(length, height);
        r1.calArea(length, height);

        scn.close();
    }
}
