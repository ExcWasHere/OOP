package Jobsheet10.Abstract;

public abstract class Animal {
    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    public void grow() {
        age++;
        System.out.println("This animal is now " + age + " years old.");
    }
    public abstract void moving();
}