package TugasJobsheet04;

public class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String info() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tahun: " + tahun;
    }
}