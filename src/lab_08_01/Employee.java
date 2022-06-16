package lab_08;

public class Employee {

    private int salary;
    private String EmployeeType;

    public Employee() {
    }

    public Employee(int salary, String employeeType) {
        this.salary = salary;
        EmployeeType = employeeType;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(String employeeType) {
        EmployeeType = employeeType;
    }
}
