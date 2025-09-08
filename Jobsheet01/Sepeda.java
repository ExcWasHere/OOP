public class Sepeda {
    String merk;
    String warna;
    int kecepatan;
    int gir;

    public void setMerk(String newValue) {
        merk = newValue;
    }

    public void setWarna(String newValue) {
        warna = newValue;
    }

    public void gantiGir(int newValue) {
        gir = newValue;
    }

    public void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    public void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    public void printStatus() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gir: " + gir);
    }
}