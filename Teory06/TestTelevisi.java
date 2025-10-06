public class TestTelevisi {
    public static void main(String[] args) {
        System.out.println("=== Uji Televisi ===");
        Televisi tv = new Televisi("Polytron", 50);
        System.out.println("Merek: " + tv.merek);
        System.out.println("Jumlah channel: " + tv.jumlahChannel);
        System.out.println("Channel aktif awal: " + tv.getChannelAktif());
        tv.pindahChannel(5);
        System.out.println("Channel aktif sekarang: " + tv.getChannelAktif());
        tv.pindahChannel(100);

        System.out.println("\n=== Uji TelevisiModern ===");
        TelevisiModern tvm = new TelevisiModern("Sony", 100);
        System.out.println("Merek: " + tvm.merek);
        System.out.println("Jumlah channel: " + tvm.jumlahChannel);
        System.out.println("Channel aktif awal: " + tvm.getChannelAktif());

        tvm.pindahChannel(10);
        tvm.gantiModusTampilan("Film");
        tvm.masukkanDVD("The Matrix");
        tvm.mainkanDVD();

        TelevisiModern tvm2 = new TelevisiModern("Samsung", 20);
        tvm2.mainkanDVD();
    }
}