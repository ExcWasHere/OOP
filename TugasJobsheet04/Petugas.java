package TugasJobsheet04;

public class Petugas {
    private String id;
    private String nama;

    public Petugas(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String info() {
        return "ID Petugas: " + id + ", Nama: " + nama;
    }
}