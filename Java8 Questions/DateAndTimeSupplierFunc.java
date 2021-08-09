import java.util.function.Supplier;

public class DateAndTimeSupplierFunc {
    public static void main(String[] args) {
        Supplier<java.util.Date> s1 = () -> {
            return new java.util.Date();
        };

        System.out.println(s1.get());
    }
}
