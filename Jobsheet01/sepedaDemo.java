public class sepedaDemo {
    public static void main(String[] args) {
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        spd1.setMerk("Polygon");
        spd1.setWarna("Merah");
        spd1.gantiGir(3);
        spd1.tambahKecepatan(20);
        spd1.printStatus();

        spd2.setMerk("United");
        spd2.setWarna("Biru");
        spd2.gantiGir(2);
        spd2.tambahKecepatan(15);
        spd2.gantiGir(3);
        spd2.tambahKecepatan(20);
        spd2.printStatus();

        spd3.setMerk("ExcBike");
        spd3.setWarna("Hitam");
        spd3.tambahKecepatan(25);
        spd3.gantiGir(2);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.printStatus();
    }
}
