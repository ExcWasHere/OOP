package Teory04;

public class TestMahasiswa {
    public static void main(String[] args) {
        Jurusan jur = new Jurusan();
        jur.setNama("Information Technology");
        jur.setAkreditasi("A");
        Mahasiswa mhs = new Mahasiswa("01010101", "Excell", jur);
        mhs.tampilkanInfo();
    }
}