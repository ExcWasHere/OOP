public class test {
    public static void main(String[] args) {
        monster mon = new monster("T-Rex", 100);
        robot rbt = new robot("Macross", 90);

        mon.destroy(new building());
        mon.destroy(new tower());
        rbt.destroy(new tower());
    }
}
