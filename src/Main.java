
public class Main {
    public static void main(String[] args) {
        PatikaStore store = new PatikaStore();
// default notebooks, brands and cellphones
        store.addBrand(new Brand(1, "Samsung"));
        store.addBrand(new Brand(2, "Lenovo"));
        store.addBrand(new Brand(3, "Apple"));
        store.addBrand(new Brand(4, "Huawei"));
        store.addBrand(new Brand(5, "Casper"));
        store.addBrand(new Brand(6, "Asus"));
        store.addBrand(new Brand(7, "HP"));
        store.addBrand(new Brand(8, "Xiaomi"));
        store.addBrand(new Brand(9, "Monster"));

            //default values the below
        store.addNotebook(new Notebook(1, 7000, 0, 0, "HUAWEI Matebook 14", new Brand(4, "Huawei"), 16, "512 ", "14.0"));
        store.addNotebook(new Notebook(2, 3699, 0, 0, "LENOVO V14 IGL    ", new Brand(2, "Lenovo"), 8, "1024", "14.0"));
        store.addNotebook(new Notebook(3, 8199, 0, 0, "ASUS Tuf Gaming   ", new Brand(3, "Asus"), 32, "2048", "15.6"));

        store.addCellPhone(new CellPhone(1, 3199.0, 0, 0, "SAMSUNG GALAXY A51 ", new Brand(1, "Samsung"), "128", "6.5", 4000, 6, "Siyah", 32));
        store.addCellPhone(new CellPhone(2, 7379.0, 0, 0, "iPhone 11 64 GB ", new Brand(2, "Apple"), "128", "6.1", 3046, 6, "Mavi", 5));
        store.addCellPhone(new CellPhone(3, 4012.0, 0, 0, "Redmi Note 10 Pro 8GB ", new Brand(3, "Xiaomi"), "128", "6.5", 4000, 12, "Beyaz", 35));

        store.start();


    }
}