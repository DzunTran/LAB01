package lab_08_01;

import java.util.ArrayList;
import java.util.List;

public class EmployeController {

    public static void main(String[] args) {

        Employee Employee1 = new FTEmployee("Employe1");
        Employee Employee2 = new FTEmployee("Employe2");
        Employee Employee3 = new FTEmployee("Employe3");
        Employee Employee4 = new ConTractEmployee("Employe4");
        Employee Employee5 = new ConTractEmployee("Employe5");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(Employee1);
        employeeList.add(Employee2);
        employeeList.add(Employee3);
        employeeList.add(Employee4);
        employeeList.add(Employee5);

        int totalSalary = 0;
        for(Employee i: employeeList){
            totalSalary = totalSalary + i.getSalary();
            System.out.println("Name: "+ i.getName() +" salary: " + i.getSalary());
        }
        System.out.printf("Total Salary of all Employee: %d", totalSalary);
    }
}
