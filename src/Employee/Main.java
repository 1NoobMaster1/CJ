package Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(25, "Developer", "Male", "Zyan Khan", 70000),
                new Employee(26, "HR", "Female", "Anjali", 70000),
                new Employee(27, "Developer", "Male", "Prakher", 70000)
        );
        List<Employee> result = employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("Developer"))
                .filter(emp -> emp.getGender().equalsIgnoreCase("Male"))
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
