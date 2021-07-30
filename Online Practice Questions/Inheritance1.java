class Base_Class {
    public String method() {
        return "BaseClass - Method";
    }
}

class Derived_Class extends Base_Class {
    public static int counter = 0;

    public String method(int x) {
        return "DerivedClass - Method";
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Base_Class bc = new Derived_Class();
        System.out.println(bc.method());
    }
}
