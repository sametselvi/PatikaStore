public class Notebook extends Product {
   private int ram;
    private String storage;
   private String screenSize;




    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
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



   public Notebook(int id, double unitPrice, double discountRate, int stockAmount, String name, Brand brand,
             int ram, String storage, String screenSize) {
        super(id, unitPrice, discountRate, stockAmount, name, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }
}
