class InvalidAge extends Exception {
    public String getMessage() {
        return "Invalid Age";
    }
}

public class NameCommandLine {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        try {
            if (age < 18 || age >= 60) {
                throw new InvalidAge();
            } else {
                System.out.println("Name: " + name + " Age: " + age);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You...!");
        }

    }
}
