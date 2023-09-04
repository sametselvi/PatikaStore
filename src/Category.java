import java.util.ArrayList;
import java.util.List;

public class Category <T>{
    ArrayList <T> categoryarray = new ArrayList<>();

    public ArrayList<T> getCategoryarray() {
        return categoryarray;
    }

    private T ram;
    private T storage;
    private T screenSize;

    private T name;

    public T getRam() {
        return ram;
    }

    public void setRam(T ram) {
        this.ram = ram;
    }

    public T getStorage() {
        return storage;
    }

    public void setStorage(T storage) {
        this.storage = storage;
    }

    public T getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(T screenSize) {
        this.screenSize = screenSize;
    }

    private T id;

    public T getName() {
        return name;
    }



    public T getId() {
        return id;
    }



    public Category(T name,T id) {
        this.name = name;
        this.id = id;
    }
    public Category(){


    }


}
