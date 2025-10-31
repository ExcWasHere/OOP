package Jobsheet10.Interface;

public class Rector {
    public void giveCumlaudeCertificate(ICumlaude student) {
        System.out.println("Congratulations! You are awarded the Cumlaude Certificate!");
        student.pass();
        student.achieveHighGPA();
        System.out.println("---------------------------------------");
    }
}