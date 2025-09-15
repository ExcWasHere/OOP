package Teory04;

class Jurusan {
    private String nama;
    private String akreditasi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getNama() {
        return nama;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void tampilkanInfo() {
        System.out.println("Major: " + nama);
        System.out.println("Accreditation: " + akreditasi);
    }
}