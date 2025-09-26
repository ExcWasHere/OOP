public class Remote {
    private String language;
    private int batteryNumber;

    Remote(String language, int batteryNumber) {
        this.language = language;
        this.batteryNumber = batteryNumber;
    }

    public String getLanguage() {
        return "Remote Language: " + language;
    }

    public int getBatteryNumber() {
        return batteryNumber;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setBatteryNumber(int batteryNumber) {
        this.batteryNumber = batteryNumber;
    }

    public String infoRemote() {
        String info = "";
        info += "Remote Language: " + language + "\n";
        info += "Battery Number: " + batteryNumber + "\n";
        return info;
    }
}
