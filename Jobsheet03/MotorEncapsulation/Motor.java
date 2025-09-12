package MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kontakOn = false;

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn) {
            if (kecepatan < 100) {
                kecepatan += 5;
                if (kecepatan > 100) {
                    kecepatan = 100;
                }
            } else {
                System.out.println("Kecepatan sudah maksimal!");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off!");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true && kecepatan > 0) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off atau kecepatan 0");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
    
}