public class robot extends character {
    private int armor;

    public robot(String name, int armor) {
        super(name);
        this.armor = armor;
    }

    @Override
    public void destroy(DestroyAble da) {
        da.destroyed();
        System.out.println("By " + name + ".");
    }
}
