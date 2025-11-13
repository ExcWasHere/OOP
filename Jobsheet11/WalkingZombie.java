package Jobsheet11;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int level, double health) {
        super(level, health);
    }

    @Override
    public void heal() {
        double inc = 0;
        if (level == 1) inc = 0.20;
        else if (level == 2) inc = 0.30;
        else if (level == 3) inc = 0.40;
        health += health * inc;
        if (health > 100) health = 100;
    }

    @Override
    public void destroyedByPlant() {
        health -= 2.0;
        if (health < 0) health = 0;
    }
}
