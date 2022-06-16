package lab_08_01;

public class ConTractEmployee extends Employee{

    @Override
    public int getSalary() {
        return 40000;
    }

    public ConTractEmployee(String name) {
        super(name);
    }
}
