public class monster extends character {
    private int power;

    public monster(String name, int power) {
        super(name);
        this.power = power;
    }

    @Override
    public void destroy(DestroyAble da) {
        da.destroyed();
        System.out.println("By " + name + ".");
    }
}
