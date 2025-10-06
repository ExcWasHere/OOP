package Jobsheet06.Percobaan3_Super;

public class Percobaan3 {
    public static void main(String[] args) {
        Tabung tabung = new Tabung();
        tabung.setSuperPhi(3.1416);
        tabung.setRT(10, 20);
        System.out.println("Volume Tabung: " + tabung.getVolume());
    }
}