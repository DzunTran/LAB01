package lab_08_01;

public class Employee {

    private int salary;
    private String employeeType;
    private String name;

    public Employee(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
}
