import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterAndCollect {
    public static void main(String[] args) {
        List<Employee> li = new ArrayList<Employee>();
        li.add(new Employee(100, "John", 18000));
        li.add(new Employee(200, "varun", 10000));
        li.add(new Employee(300, "Riya", 21000));

        List<Employee> li2 = li.stream().filter(emp -> emp.salary > 15000).collect(Collectors.toList());

        for (Employee employee : li2) {
            System.out.println(employee.name);
        }
    }
}
