public class PatrolRobot {
    private Robot robot;
    private Battery battery;

    public PatrolRobot(String name, int CPUspeed, int Power, int capacity) {
        this.robot = new Robot(name, CPUspeed, Power);
        this.battery = new Battery("DefaultMerk", capacity);
    }

    public Robot getRobot() {
        return robot;
    }

    public Battery getBattery() {
        return battery;
    }

    public void increasePower() {
        for (int i = 0; i < 2; i++) {
            robot.increasePower();
        }
    }

    public void reducePower() {
        robot.reducePower();
    }
}
