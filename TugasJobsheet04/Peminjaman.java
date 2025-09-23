package TugasJobsheet04;

public class Peminjaman {
    private Buku buku;
    private Anggota anggota;
    private Petugas petugas;
    private int lamaPinjam;

    public Peminjaman(Buku buku, Anggota anggota, Petugas petugas, int lamaPinjam) {
        this.buku = buku;
        this.anggota = anggota;
        this.petugas = petugas;
        this.lamaPinjam = lamaPinjam;
    }

    public String info() {
        return anggota.info() + "\n" +
               buku.info() + "\n" +
               petugas.info() + "\n" +
               "Lama Pinjam: " + lamaPinjam + " hari";
    }
}