public class StudentCloneable implements Cloneable {
    int id;
    String name;

    StudentCloneable(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        StudentCloneable s1 = new StudentCloneable(101, "John");
        System.out.println(s1.id + " " + s1.name);

        try {
            StudentCloneable s2 = (StudentCloneable) s1.clone();
            System.out.println(s2.id + " " + s2.name);
        } catch (Exception e) {
            System.out.println(s1.toString());
        }
    }
}
