package Jobsheet11;

public class Barrier {
    private double durability;

    public Barrier(double durability) {
        this.durability = durability;
    }

    public void beDestroyedByPlant() {
        durability -= 10;
        if (durability < 0) durability = 0;
    }

    public double getDurability() {
        return durability;
    }

    public void show() {
        System.out.println("Barrier durability = " + durability);
    }
}
