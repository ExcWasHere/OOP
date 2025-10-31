package Jobsheet10.Interface;

public class Postgraduate extends Student implements ICumlaude {

    public Postgraduate(String name) {
        super(name);
    }

    @Override
    public void pass() {
        System.out.println(name + " has finished the dissertation successfully.");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println(name + " has achieved a GPA higher than 3.71.");
    }
}