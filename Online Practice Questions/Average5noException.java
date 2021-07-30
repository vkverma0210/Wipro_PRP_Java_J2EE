class ArrayException extends Exception {
    public String getMessage() {
        return "Array Index Out Of Bounds";
    }
}

public class Average5noException {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new ArrayException();
            } else {
                int sum = 0;
                int average = 0;

                for (int i = 0; i < args.length; i++) {
                    sum += Integer.parseInt(args[i]);
                }

                average = sum / args.length;

                System.out.println("Average: " + average);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank You...!");
        }
    }
}
