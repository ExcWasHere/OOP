package Jobsheet11;

public abstract class Zombie {
    protected int level;
    protected double health;

    public Zombie(int level, double health) {
        this.level = level;
        this.health = health;
    }

    public abstract void heal();
    public abstract void destroyedByPlant();

    public double getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void showStatus() {
        System.out.println(this.getClass().getSimpleName() +
            " (level " + level + ") health = " + String.format("%.2f", health) + "%");
    }
}
