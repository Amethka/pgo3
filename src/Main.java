import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer("Janusz", "Januszowaty", "Staroświecka 3", "januszex@windowslive.pl", "12345678901", 2010);
        dev.addTechnology("Java");
        dev.addTechnology("Python");

        Tester tester = new Tester("Maja", "Kowal", "Warszawska 12", "M.Kowal@wp.pl", "9876543210", 2015);
        tester.addTestType("Unit Testing");
        tester.addTestType("UI Testing");

        Manager manager = new Manager("Marcin", "Nowak", "Radominska 1", "Nowak.Marnin@outlook.com", "56789012345", 2005);
        manager.addGoal("Increase Team Productivity");
        manager.addGoal("Launch New Product");

        List<Employee> pracownicy = new ArrayList<Employee>();
        pracownicy.add(dev);
        pracownicy.add(tester);
        pracownicy.add(manager);


        for (Employee employee : pracownicy) {
            System.out.println("Pracownik: " + employee.getFirstName() + " " + employee.getLastName());
            System.out.println("Salary: " + employee.calculateSalary() + " zl\n");
        }
    }
}