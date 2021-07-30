class BaseClass {
    public void displayMethod() {
        System.out.println("BaseClass display Method");
    }
}

class DerivedClass extends BaseClass {
    public void displayMethod() {
        System.out.println("DerivedClass display Method");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // BaseClass bc = new BaseClass();
        // bc.displayMethod();

        BaseClass bd = new DerivedClass();
        bd.displayMethod();

        // DerivedClass dc = new DerivedClass();
        // dc.displayMethod();

        // DerivedClass db = new BaseClass();
        // db.displayMethod();
    }
}
