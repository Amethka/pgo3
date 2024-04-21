abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String PESEL;
    protected int hireYear;
    protected double baseSalary = 3000.0;

    public Employee(String firstName, String lastName, String address, String email, String PESEL, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.PESEL = PESEL;
        this.hireYear = hireYear;
    }

    public double calculateSalary() {
        int yearsWorked = 2024 - hireYear;
        return baseSalary + (yearsWorked * 1000);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}