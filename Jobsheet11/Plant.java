package Jobsheet11;

public class Plant {
    public void attackZombie(Zombie z) {
        System.out.println("Plant attacks " + z.getClass().getSimpleName());
        z.destroyedByPlant();
    }

    public void attackBarrier(Barrier b) {
        System.out.println("Plant attacks Barrier");
        b.beDestroyedByPlant();
    }

    public void healZombie(Zombie z) {
        System.out.println("Plant heals " + z.getClass().getSimpleName());
        z.heal();
    }
}
