public class Palindrom {
    public static void main(String[] args) {
        String str = args[0];
        int n = str.length() - 1;

        int i = 0;
        boolean flag = true;
        while (i < n) {
            if (str.charAt(i) != str.charAt(n)) {
                flag = false;
                break;
            }
            i++;
            n--;
        }

        if (flag == false) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
