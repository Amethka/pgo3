import java.util.ArrayList;
import java.util.List;
class Manager extends Employee {
    private List<String> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String PESEL, int hireYear) {
        super(firstName, lastName, address, email,PESEL, hireYear);
    }

    public void addGoal(String goal) {
        goals.add(goal);
    }

    public void checkGoalsAndAddBonus() {

        double bonus = goals.size() * 2000;
        if (bonus > 0) {
            System.out.println("Bonus za osiagniete cele: " + bonus + " zl");
            baseSalary += bonus;
        }
    }

    @Override
    public double calculateSalary() {
        checkGoalsAndAddBonus();
        return super.calculateSalary();
    }
}