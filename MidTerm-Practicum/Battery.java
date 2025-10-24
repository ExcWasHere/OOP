public class Battery {
    private String merk;
    private int capacity;

    public Battery() {
        
    }

    public Battery(String merk, int capacity) {
        this.merk = merk;
        this.capacity = capacity;
    }

    public String getMerk() {
        return merk;
    }

    public int getCapacity() {
        return capacity;
    }
}