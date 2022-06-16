package lab_08_01;

public class FTEmployee extends Employee {

    @Override
    public int getSalary() {
        return 50000;
    }

    public FTEmployee(String name) {
        super(name);
    }
}
