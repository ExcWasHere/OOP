package Jobsheet11;

public class employee {
    protected String name;
    protected String id;

    public employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}