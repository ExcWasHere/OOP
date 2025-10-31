package Jobsheet10.Abstract;

public class Fish extends Animal {

    public Fish(int age) {
        super(age);
    }

    @Override
    public void moving() {
        System.out.println("The fish moves by wagging its fins.");
    }
}