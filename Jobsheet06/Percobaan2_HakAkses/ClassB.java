package Jobsheet06.Percobaan2_HakAkses;

public class ClassB extends ClassA {
    int z;

    public void getJumlah() {
        // z = x + y; error karena x private di ClassA
        // solusinya: kita panggil lewat method public di ClassA
        System.out.println("Tidak bisa akses langsung x soalnya private.");
    }
}
