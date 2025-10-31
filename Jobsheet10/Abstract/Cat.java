package Jobsheet10.Abstract;

public class Cat extends Animal {

    public Cat(int age) {
        super(age);
    }

    @Override
    public void moving() {
        System.out.println("The cat moves by walking on its feet.");
    }
}