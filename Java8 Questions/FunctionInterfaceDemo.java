import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        int x = 4;

        Function<Integer, Integer> fn1 = (num) -> (x * x);

        System.out.println(fn1.apply(x));

        String s = "Welcome";
        Function<String, Integer> fn2 = (s1) -> s1.length();
        System.out.println(fn2.apply(s));
    }
}
