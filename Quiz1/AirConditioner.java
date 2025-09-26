public class AirConditioner {
    private String brand;
    private int productionYear;
    private Remote remote;
    private Compressor compressor;

    AirConditioner(String brand, int productionYear, Remote remote, Compressor compressor) {
        this.brand = brand;
        this.productionYear = productionYear;
        this.remote = remote;
        this.compressor = compressor;
    }

    public String getBrand() {
        return brand;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Remote getRemote() {
        return remote;
    }

    public Compressor getCompressor() {
        return compressor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String infoAirConditioner() {
        String info = "";
        info += "AC Brand: " + brand + "\n";
        info += remote.getLanguage() + "\n";
        info += "Compressor Capacity: " + compressor.getCapacity() + "\n";
        return info;
    }
}
