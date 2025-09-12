package KoperasiGetterSetter;

public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Ali", "Malang");
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("Simpanan: " + anggota1.getSimpanan());

        anggota1.setNama("Ali");
        anggota1.setAlamat("Malang");
        anggota1.setor(100000);
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("Simpanan: " + anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Nama: " + anggota1.getNama());
        System.out.println("Simpanan: " + anggota1.getSimpanan());

    }
}
