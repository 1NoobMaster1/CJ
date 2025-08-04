package Employee;

public class Employee {

    private int age;
    private String department;
    private String gender;
    private String name;
    private double salary;

    public Employee(int age, String department, String gender, String name, double salary) {
        this.age = age;
        this.department = department;
        this.gender = gender;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return age + " | " + department + " | " + gender + " | " + name + " | " + salary;
    }

}
