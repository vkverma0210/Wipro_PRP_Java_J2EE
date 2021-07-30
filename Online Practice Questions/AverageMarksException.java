import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double Average() {
        int sum = 0;

        for (int n : marks) {
            sum += n;
        }

        return (sum / marks.length);
    }

    void display() {
        System.out.println("Name: " + name + " Avewrage: " + Average());
    }
}

class ValueOutOfRangeException extends Exception {
    public String getMessage() {
        return "ValuesOutOfRangeException occured";
    }
}

class NegativeValueException extends Exception {
    public String getMessage() {
        return "NegativeValueException occured";
    }
}

public class AverageMarksException {
    private static Scanner scn;

    public static void main(String[] args) {
        scn = new Scanner(System.in);
        int size = scn.nextInt();
        Student s[] = new Student[size];

        try {
            for (int i = 0; i < s.length; i++) {
                String name = new String();
                int marks[] = new int[3];

                System.out.print("Name: ");
                name = scn.next();

                System.out.println("Enter Marks: ");

                for (int j = 0; j < marks.length; j++) {
                    System.out.print("Subject " + (int) (j + 1) + " : ");
                    marks[j] = scn.nextInt();

                    if (marks[j] < 0) {
                        throw new NegativeValueException();
                    } else if (marks[j] > 100) {
                        throw new ValueOutOfRangeException();
                    }
                }

                s[i] = new Student(name, marks);
                s[i].display();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please Provide arguments in the format.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter Integer for marks.");
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (ValueOutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        scn.close();
    }
}
