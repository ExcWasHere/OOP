public class MainAC {
    public static void main(String[] args) {
        Compressor compressor = new Compressor("R32", 1000);
        Remote remote = new Remote("English", 2);
        AirConditioner ac = new AirConditioner("Daikin", 2019, remote, compressor);

        System.out.println(ac.infoAirConditioner());
    }
}
