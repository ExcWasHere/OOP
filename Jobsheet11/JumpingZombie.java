package Jobsheet11;

public class JumpingZombie extends Zombie {

    public JumpingZombie(int level, double health) {
        super(level, health);
    }

    @Override
    public void heal() {
        double inc = 0;
        if (level == 1) inc = 0.30;
        else if (level == 2) inc = 0.40;
        else if (level == 3) inc = 0.50;
        health += health * inc;
        if (health > 100) health = 100;
    }

    @Override
    public void destroyedByPlant() {
        health -= 1.0;
        if (health < 0) health = 0;
    }
}
