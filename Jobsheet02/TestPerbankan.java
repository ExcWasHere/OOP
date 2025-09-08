package Jobsheet02;

public class TestPerbankan {
    public static void main(String[] args) {
        Nasabah nsb = new Nasabah();

        nsb.nama = "Andi";
        nsb.saldo = 1000000;

        nsb.tampilkanSaldo("IDR");
    }
}
