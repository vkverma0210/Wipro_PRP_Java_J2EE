import java.util.function.Supplier;

public class RandomNoSupplierFunc {
    public static void main(String[] args) {
        Supplier<Double> s1 = () -> {
            return Math.random() * 4;
        };

        System.out.println(s1.get());
    }
}
