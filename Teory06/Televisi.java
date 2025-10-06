public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi() {
        this.merek = "Unknown";
        this.jumlahChannel = 0;
        this.channelAktif = 1;
    }

    public Televisi(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = (jumlahChannel > 0) ? 1 : 0;
    }

    public void pindahChannel(int channelBaru) {
        if (channelBaru < 1) {
            System.out.println("Channel tidak valid. Nomor channel harus >= 1.");
            return;
        }
        if (this.jumlahChannel > 0 && channelBaru > this.jumlahChannel) {
            System.out.println("Channel tidak tersedia. Maksimum channel: " + this.jumlahChannel);
            return;
        }
        this.channelAktif = channelBaru;
        System.out.println("Channel berpindah ke: " + this.channelAktif);
    }

    public int getChannelAktif() {
        return this.channelAktif;
    }
}