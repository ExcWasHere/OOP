package TugasJobsheet04;

public class MainPinjam {
    public static void main(String[] args) {
        Buku b = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);
        Anggota a = new Anggota("A01", "Izuu");
        Petugas p = new Petugas("P01", "Budi");
        Peminjaman pem = new Peminjaman(b, a, p, 7);

        System.out.println(pem.info());
    }
}
