public class EmployeeNullCheck {
    String name;

    public static void main(String[] args) {
        EmployeeNullCheck obj1 = new EmployeeNullCheck();
        System.out.println(obj1.name);

        char first_char = obj1.name.charAt(0);
        System.out.println(first_char);
    }
}
