public class Staff extends Karyawan {
    double lembur;
    double potongan;

    public Staff(String nama, double gajiPokok, double lembur, double potongan) {
        super(nama, gajiPokok);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + lembur - potongan;
    }

    public double hitungGaji(double bonus) {
        return gajiPokok + lembur - potongan + bonus;
    }
}