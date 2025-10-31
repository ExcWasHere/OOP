package Jobsheet10.Interface;

public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public void studyOnCampus() {
        System.out.println(name + " is studying on campus.");
    }
}