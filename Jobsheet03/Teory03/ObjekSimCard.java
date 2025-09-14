class SimCard {
    private String nomorTelepon;
    private int kuotaInternet;

    public SimCard(String nomorTelepon, int kuotaInternet) {
        this.nomorTelepon = nomorTelepon;
        this.kuotaInternet = kuotaInternet;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public int getKuotaInternet() {
        return kuotaInternet;
    }

    public void tambahKuota(int jumlah) {
        if (jumlah > 0) {
            kuotaInternet += jumlah;
            System.out.println("Kuota berhasil ditambah: " + jumlah + " MB");
        }
    }

    public void pakaiKuota(int jumlah) {
        if (jumlah > 0 && jumlah <= kuotaInternet) {
            kuotaInternet -= jumlah;
            System.out.println("Kuota digunakan: " + jumlah + " MB");
        } else {
            System.out.println("Kuota tidak mencukupi!");
        }
    }
}

public class ObjekSimCard {
    public static void main(String[] args) {
        SimCard sim = new SimCard("08123456789", 5000);

        System.out.println("Nomor: " + sim.getNomorTelepon());
        System.out.println("Kuota awal: " + sim.getKuotaInternet() + " MB");

        sim.pakaiKuota(1000);
        System.out.println("Sisa kuota: " + sim.getKuotaInternet() + " MB");

        sim.tambahKuota(2000);
        System.out.println("Sisa kuota sekarang: " + sim.getKuotaInternet() + " MB");
    }
}
