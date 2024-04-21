import java.util.ArrayList;
import java.util.List;
class Developer extends Employee {
    private List<String> technologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String PESEL, int hireYear) {
        super(firstName, lastName, address, email, PESEL, hireYear);
    }

    public void addTechnology(String technology) {
        technologies.add(technology);
    }

    @Override
    public double calculateSalary() {
        double bonus = technologies.size() * 500;
        return super.calculateSalary() + bonus;
    }
}