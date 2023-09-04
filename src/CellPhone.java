public class CellPhone extends Product {
    private String storage;
    private String screenSize;
    private int batteryPower;
    private int ram;
    private int camera;

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public CellPhone(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand,
                     String storage, String screenSize, int batteryPower, int ram, String color, int camera) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.storage = storage;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
        this.camera= camera;
    }
}