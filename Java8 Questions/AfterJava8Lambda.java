interface iface2 {
    int add(int x, int y);
}

public class AfterJava8Lambda {
    public static void main(String[] args) {
        iface2 i1 = (x, y) -> (x + y);

        int ans = i1.add(10, 20);
        System.out.println(ans);

        ans = i1.add(100, 200);
        System.out.println(ans);
    }
}
