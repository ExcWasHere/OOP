package Jobsheet11;

public class permanentEmployee extends employee implements payable {
    private double salary;

    public permanentEmployee(String id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("Permanent Employee -> ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    @Override
    public void pay() {
        System.out.println("Paying salary to " + name + " : " + salary);
    }

    public double getSalary() {
        return salary;
    }
}
