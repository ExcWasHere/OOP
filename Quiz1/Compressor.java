public class Compressor {
    private String type;
    private int capacity;

    Compressor(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String infoCompressor() {
        String info = "";
        info += "Type: " + type + "\n";
        info += "Capacity: " + capacity + "\n";
        return info;
    }
}
