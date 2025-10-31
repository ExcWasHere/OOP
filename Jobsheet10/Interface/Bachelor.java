package Jobsheet10.Interface;

public class Bachelor extends Student implements ICumlaude {

    public Bachelor(String name) {
        super(name);
    }

    @Override
    public void pass() {
        System.out.println(name + " has finished the thesis successfully.");
    }

    @Override
    public void achieveHighGPA() {
        System.out.println(name + " has achieved a GPA higher than 3.51.");
    }
}