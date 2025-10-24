public class TestPatrolRobot {
    public static void main(String[] args) {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, 16000);

        pr.increasePower();

        System.out.println("Name: Patrol " + pr.getRobot().getName());
        System.out.println("CPU Speed: " + pr.getRobot().getCPUspeed());
        System.out.println("Power: " + pr.getRobot().getPower());
        System.out.println("Battery Capacity: " + pr.getBattery().getCapacity());
    }
}