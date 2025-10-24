public class Robot {

    private String name;
    private int CPUspeed;
    private int Power;

    public Robot(String name, int CPUspeed, int Power) {
        this.name = name;
        this.CPUspeed = CPUspeed;
        this.Power = Power;
    }

    public String getName() {
        return name;
    }

    public int getCPUspeed() {
        return CPUspeed;
    }

    public int getPower() {
        return Power;
    }

    public void increasePower() {
        this.Power += 10;
    }

    public void reducePower() {
        this.Power -= 10;
    }
}