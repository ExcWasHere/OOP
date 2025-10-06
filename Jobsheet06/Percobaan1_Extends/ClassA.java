package Jobsheet06.Percobaan1_Extends;

public class ClassA {
    int x;
    int y;

    void getNumber(int a, int b) {
        x = a;
        y = b;
    }

    void tampilkanNilai() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }
}