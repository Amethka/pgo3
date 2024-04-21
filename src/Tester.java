import java.util.ArrayList;
import java.util.List;

class Tester extends Employee {
    private List<String> testTypes = new ArrayList<String>();

    public Tester(String firstName, String lastName, String address, String email, String PESEL, int hireYear)
    {
        super(firstName, lastName, address, email,PESEL, hireYear);
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public double calculateSalary() {
        double bonus = testTypes.size() * 300;
        return super.calculateSalary() + bonus;
    }
}