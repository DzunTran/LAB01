package lab_08;

import lesson3.Array;

import java.util.ArrayList;
import java.util.List;

public class EmployeController {

    public static void main(String[] args) {

        Employee FTEmployee = new FTEmployee();
        Employee ContractEmployee = new ConTractEmployee();

        int Salary = 0;
        List<Employee> List = new ArrayList<>();
        for(Employee e: List){
            Salary = Salary + e.getSalary();
        }
        System.out.printf("AAA: %d", Salary);
    }
}
