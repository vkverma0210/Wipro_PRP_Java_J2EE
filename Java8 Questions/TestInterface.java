/**
 * TestInterface
 */
interface Test_Interface {
    public void square(int a);

    default void show() {
        System.out.println("Dafualt Method Executed");
    }
}

public class TestInterface implements Test_Interface {
    public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        TestInterface d = new TestInterface();
        d.square(4);

        d.show();
    }
}