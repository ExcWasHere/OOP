package Teory04;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private Jurusan jur;

    public Mahasiswa(String nim, String nama, Jurusan jur) {
        this.NIM = nim;
        this.nama = nama;
        this.jur = jur;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJur(Jurusan jur) {
        this.jur = jur;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return nama;
    }

    public Jurusan getJur() {
        return jur;
    }

    public void tampilkanInfo() {
        System.out.println("Student ID      : " + NIM);
        System.out.println("Student Name    : " + nama);
        jur.tampilkanInfo();
    }
}