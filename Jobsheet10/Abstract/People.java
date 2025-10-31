package Jobsheet10.Abstract;

public class People {
    private String name;

    public People(String name) {
        this.name = name;
    }

    public void walkPet(Animal pet) {
        System.out.print(name + " makes their pet move: ");
        pet.moving();
    }
}