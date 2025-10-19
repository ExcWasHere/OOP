public class Utama {
    public static void main(String[] args) {
        Karyawan k = new Karyawan("Dewi", 4000000);
        Manager m = new Manager("Budi", 5000000, 2000000);
        Staff s = new Staff("Ayu", 3500000, 500000, 200000);

        System.out.println("=== Data Karyawan ===");
        k.tampilData();
        System.out.println("Total Gaji: " + k.hitungGaji());

        System.out.println("\n=== Data Manager ===");
        m.tampilData();
        System.out.println("Total Gaji: " + m.hitungGaji());

        System.out.println("\n=== Data Staff ===");
        s.tampilData();
        System.out.println("Total Gaji: " + s.hitungGaji());
        System.out.println("Total Gaji + Bonus: " + s.hitungGaji(300000)); // overloading
    }
}