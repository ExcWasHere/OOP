public class TelevisiModern extends Televisi {
    private String Tampilan;
    private String dvd;

    public TelevisiModern(String mrk, int jmlChannel) {
        super(mrk, jmlChannel);
        this.Tampilan = "Standar";
        this.dvd = null;
    }

    public void gantiModusTampilan(String modus) {
        if (modus == null || modus.isEmpty()) {
            System.out.println("Modus tampilan tidak boleh kosong.");
            return;
        }
        this.Tampilan = modus;
        System.out.println("Modus tampilan diubah menjadi: " + this.Tampilan);
    }

    public void masukkanDVD(String judulDVD) {
        if (judulDVD == null || judulDVD.isEmpty()) {
            System.out.println("Judul DVD tidak boleh kosong.");
            return;
        }
        this.dvd = judulDVD;
        System.out.println("DVD \"" + this.dvd + "\" dimasukkan.");
    }

    public void mainkanDVD() {
        if (this.dvd == null) {
            System.out.println("Tidak ada DVD untuk diputar.");
        } else {
            System.out.println("Memutar DVD: \"" + this.dvd + "\" ...");
        }
    }
}