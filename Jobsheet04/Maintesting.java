package Jobsheet04;

public class Maintesting {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3.0);
        Laptop L = new Laptop("Thinkpad", p);
        L.info();

        Processor p1 = new Processor();
        p1.setMerk("Intel i5");
        p1.setCache(4.0);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(p1);
        L1.info();

    }
}