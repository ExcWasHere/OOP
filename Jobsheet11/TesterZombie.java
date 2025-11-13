package Jobsheet11;

public class TesterZombie {
    public static void main(String[] args) {
        WalkingZombie wz1 = new WalkingZombie(1, 50);
        JumpingZombie jz1 = new JumpingZombie(2, 40);
        Barrier barrier = new Barrier(80);

        Plant plant = new Plant();

        System.out.println("Initial:");
        wz1.showStatus();
        jz1.showStatus();
        barrier.show();
        plant.healZombie(wz1);
        plant.healZombie(jz1);

        System.out.println("\nAfter healing:");
        wz1.showStatus();
        jz1.showStatus();
        plant.attackZombie(wz1);
        plant.attackZombie(jz1);
        System.out.println("\nAfter destruction attempts:");
        wz1.showStatus();
        jz1.showStatus();
        plant.attackBarrier(barrier);
        System.out.println("\nAfter attacking barrier:");
        barrier.show();
    }
}
