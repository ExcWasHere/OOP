package Jobsheet06.Percobaan3_Super;

public class Tabung extends Bangun {
    double t;

    void setSuperPhi(double phi) {
        super.phi = phi;
    }

    void setRT(double r, double t) {
        this.r = r;
        this.t = t;
    }

    double getVolume() {
        return super.phi * r * r * t;
    }
}
