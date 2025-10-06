package Jobsheet06.Percobaan1_Extends;

public class ClassB extends ClassA {
    int z;

    void getJumlah() {
        z = x + y;
        System.out.println("Jumlah: " + z);
    }
}