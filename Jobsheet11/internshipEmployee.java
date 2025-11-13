package Jobsheet11;

public class internshipEmployee extends employee {
    public internshipEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public void getEmployeeInfo() {
        System.out.println("Internship Employee -> ID: " + id + ", Name: " + name);
    }
}