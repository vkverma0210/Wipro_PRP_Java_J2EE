import java.util.Optional;

public class GetDemo {
    // String name = "Admin";
    String name;

    public static void main(String[] args) {
        GetDemo obj1 = new GetDemo();
        Optional<String> n = Optional.ofNullable(obj1.name);
        System.out.println(n.get());
    }
}
