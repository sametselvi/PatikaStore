

import java.util.*;

public class PatikaStore {
    List<Brand> brands = new ArrayList<>();

    List<CellPhone> cellPhones = new ArrayList<>();
    List<Notebook> notebooks = new ArrayList<>();
    List<Category> panel = new ArrayList<>();


    void addBrand(Brand brand) {
        brands.add(brand);

        Collections.sort(brands, Comparator.comparing(b -> b.getName()));
    }

    void removeBrand(Brand brand) {
        brands.remove(brand);


    }


    public Scanner input = new Scanner(System.in);


    void listBrands() {
        System.out.println("Available Brands:");


        int count = 0;
        for (Brand brand : brands) {
            count++;
            System.out.println(count + ". " + brand.getName());


        }
        Collections.sort(brands, Comparator.comparing(b -> b.getId()));

    }

    public void listNotebook() {
        System.out.println("Available Notebooks: ");
        System.out.println("Notebook Listesi");
        System.out.println();


        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

        // OLD STYLE  System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka         | Depolama      | Ekran | RAM   | İndirim Yüzdesi |");


        Formatter fmt = new Formatter();
        fmt.format("%s%15s%26s%13s%19s%12s%15s%20s\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "  İndirim Yüzdesi");


        int count = 0;

        for (Notebook notebook : notebooks) {
            count++;

            fmt.format("%1s%26s%15s%15s%15s%15s%15s%15s\n", count, notebook.getName(), notebook.getUnitPrice(), notebook.getBrand().getName(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRam(), notebook.getDiscountRate());
            //     System.out.println("|\s" + count + "\s\s|" + "\s" + notebook.getName() + "\t\t\t\s\s|\t" + notebook.getUnitPrice() + "\t\t\s\s|\t" + notebook.getBrand().getName() + "\t\t\s\s|\t" + notebook.getStorage() + "\t\t\s\s|\t" + notebook.getScreenSize() + "\s\s|\s" + notebook.getRam() + "\t\s\s|\s" + notebook.getDiscountRate()
            //         + "\t\s\t\t\t|");
        }
        System.out.println(fmt);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");

    }

    public void addNotebook(Notebook notebook) {

        notebooks.add(notebook);

    }

    public void addCellPhone(CellPhone cellPhone) {
        cellPhones.add(cellPhone);
    }

    public void start() {


        System.out.println("<<<<<<<PatikaStore'a Hoşgeldiniz >>>>>>>>>>>>>");

        controlPanel();
        boolean continueTask = true;
        while (continueTask) {

            getPanel();


            int select = input.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Çıkış");
                    continueTask = false;


                    break;
                case 1:
                    listNotebook();

                    break;

                case 2:
                    listCellPhone();

                    break;
                case 3:
                    listBrands();

                    break;

                case 4:


                    addAndRemoveProductAndBrand();

                    break;

                case 5:
                    // When you add new product , we have to increase case scenerio.
                    newProduct();
                    break;

                default:
                    System.out.println("Geçersiz İşlem");
                    break;
            }


        }


    }

    public List<Category> getPanel() {
        for (Category p : panel
        ) {

            System.out.println(p.getId() + " " + "-" + " " + p.getName());

        }
        System.out.println("0 - Çıkış");
        return null;
    }

    public void controlPanel() {


        System.out.println("PatikaStore Ürün Yönetim Paneli !");

        panel.add(new Category("Notebook İşlemleri", 1));
        panel.add(new Category("Cep Telefonu İşlemleri", 2));
        panel.add(new Category("Marka Listele", 3));
        panel.add(new Category("Sisteme ürün , Marka Ekleme ve Çıkarma", 4));


        // panel.add("1 - Notebook İşlemleri");
        // panel.add("2 - Cep Telefonu İşlemleri");
        //panel.add("3 - Marka Listele");
        //panel.add("4 - Sisteme ürün , Marka Ekleme ve Çıkarma");
        // panel.add("0 - Çıkış");


   /*     System.out.println("1 - Notebook İşlemleri");
       System.out.println("2 - Cep Telefonu İşlemleri");
        System.out.println("3 - Marka Listele");
         System.out.println("4 - Sisteme ürün , Marka Ekleme ve Çıkarma");
        System.out.println("0 - Çıkış");



    */


    }

    public boolean addAndRemoveProductAndBrand() {
        System.out.println("1-  Marka Eklemek veya Çıkarma İşlemleri> ");
        System.out.println("2-  Notebook Eklemek veya Çıkarma İşlemleri ");
        System.out.println("3-  Ceptelefonu Eklemek veya Çıkarma İşlemleri");
        System.out.println("4-  Yeni Ürün Kategorisi Ekleme ve Çıkarma ");


        int select = input.nextInt();

        switch (select) {
            case 1:
                addAndRemoveBrand();

                break;
            case 2:
                addAndRemoveNotebook();


                break;

            case 3:
                addAndRemoveCellPhone();
                break;

            case 4:
                selectAddOrRemoveCategory();
                break;
            default:
                System.out.println("Geçersiz İşlem Girdiniz");
                break;

        }


        return true;
    }

    private void selectAddOrRemoveCategory() {
        System.out.println("Eklemek için <<<<A>>> ya  Kaldırmak İçin <<<<R>>> basın :");
        String select = input.next().toLowerCase();
        if (select.equals("a") || select.equals("r")) {
            if (select.equals("a")) {
                addNewProductCategory();

            } else {
                removeNewProductCategory();
            }

        } else {
            System.out.println("Yanlış girdiniz !!!");
        }
    }

    private void addNewProductCategory() {
        System.out.println("Lütfen Ürün Kategorisi Adını Giriniz :");
        String categoryName = input.next();
        System.out.println("Sıra numarasını giriniz : ");
        String s2 = categoryName.substring(0, 1).toUpperCase();
        String s3 = categoryName.substring(1).toLowerCase();
        String rest = s2 + s3;

        int id = input.nextInt();
        panel.add(new Category(rest, id));

    }

    private void removeNewProductCategory() {
        System.out.println("Kaldırmak istediğiniz Ürün Kategorisinin Adını Giriniz ");
        String categoryName = input.next();
        String s2 = categoryName.substring(0, 1).toUpperCase();
        String s3 = categoryName.substring(1).toLowerCase();
        String rest = s2 + s3;

        for (int i = 0; i < panel.size(); i++) {

            if (panel.get(i).getName().equals(rest)) {
                panel.remove(i);

            }

        }
//

    }


    public void addAndRemoveBrand() {
        System.out.println("Marka Eklemek için <<<<A>>> Yazınız ");

        System.out.println("---------------------------------------");

        System.out.println("Marka Silmek için <<<<<R>> Yazınız");
        String x = input.next().toLowerCase();


        if (x.equals("a") || x.equals("r")) {
            if (x.equals("a")) {
                addNewBrand();

                System.out.println("Ekleme Çıkarma Yapılacak Yer!!!");


            } else if (x.equals("r")) {
                System.out.println("Çıkarma işlemi yapılacak");
                System.out.println("Lütfen Marka 'nın sıra numarasını Giriniz !!");
                int removeBrandInput = input.nextInt();


                for (int i = 0; i < brands.size(); i++) {
                    if (removeBrandInput == brands.get(i).getId()) {

                        System.out.println(brands.get(i).getName() + " " + "listeden çıkarıldı ");
                        removeBrand(brands.get(i));

                    }

                }


            }
        } else {


            boolean isShow = true;


            while (isShow) {

                System.out.println("Yanlış yazdınız lütfen tekrar yazınız :");

                String b = input.next().toLowerCase();
                if (b.equals("ekle")) {

                    addNewBrand();
                    isShow = false;
                } else if (b.equals("çıkar")) {
                    isShow = false;


                }


            }


        }

    }

    public void addNewBrand() {
        int a = 1;


        for (Brand brand : brands) {
            brand.setId(a++);

        }
        //Buradaki a unique id leri markaların !!!
        System.out.println("Lütfen Marka İsmini Giriniz !!");
        String enterBrandName = input.next();
        String s2 = enterBrandName.substring(0, 1).toUpperCase();
        String s3 = enterBrandName.substring(1);
        String rest = s2 + s3;

        addBrand(new Brand(a, rest));
        // System.out.println(brands.get(1).id);

    }

    public void removeNewBrand() {

    }


    public void addAndRemoveNotebook() {

        System.out.println("Ürün eklemek için <<A>>> harfini giriniz !!!");
        System.out.println("Ürün'ü silmek için <D>>>> harfini giriniz !!!");

        String e = input.next().toLowerCase();

        if (e.equals("a") || (e.equals("d"))) {

            if (e.equals("a")) {

                int a = 1;


                for (Notebook notebook : notebooks) {
                    notebook.setId(a++);

                }

                Notebook Qnotebook =  new Notebook(a, 0, 0, 0, "", new Brand(1, "Samsung"), 128, "6.5", "4000");
                System.out.println("Lütfen ürünün adı ve modelini giriniz :");
                input.nextLine();
                String enterProductName = input.nextLine();
                Qnotebook.setName(enterProductName);
                System.out.println("Birim fiyatı girin : ");
                double enterUnitPrice = input.nextDouble();
                Qnotebook.setUnitPrice(enterUnitPrice);
               // System.out.println("İndirim oranını girin :");



                System.out.println("<<<<<<<Marka id ve adını sırasıyla giriniz >>>");
                System.out.println();
                System.out.println("id : ");
                input.nextLine();
                String idforB = input.nextLine();
                int idforBrand = Integer.valueOf(idforB);
                System.out.println("Adını giriniz:");

                String nameForBrand = input.nextLine();


                Brand ab = new Brand(idforBrand, nameForBrand);
                Qnotebook.setBrand(ab);

                System.out.println("Lütfen ram i giriniz !");
                int selectForRam = input.nextInt();
                Qnotebook.setRam(selectForRam);

                System.out.println("Depolamayı giriniz : ");
                input.nextLine();
                String enterForStorage = input.nextLine();
                Qnotebook.setStorage(enterForStorage);
                System.out.println("Ekran boyutunu giriniz : ");
                String enterScreenSize = input.nextLine();
                Qnotebook.setScreenSize(enterScreenSize);

                notebooks.add(Qnotebook);
                System.out.println(notebooks.get(a - 1).getName() + " " + "eklendi.");

            } else if (e.equals("d")) {
                System.out.println("Silinmesini istediğiniz Notebook' un id 'sini giriniz ");


                try {
                    int d = input.nextInt();
                    notebooks.remove(notebooks.get(d-1));

                } catch (IndexOutOfBoundsException exception) {
                    System.out.println("Lütfen arrayin sınırını aşmayacak bir index seçiniz !!");

                }


            }

        } else {
            System.out.println("Lütfen tekrar girdiniz hatalı giriş ");
        }
    }

    public void addAndRemoveCellPhone() {

        System.out.println("Ürün eklemek için <<A>>>> harfini giriniz !!!");
        System.out.println("Ürün'ü silmek için <D>>>>> harfini giriniz !!!");

        String e = input.next().toLowerCase();

        if (e.equals("a") || (e.equals("d"))) {

            if (e.equals("a")) {
                int a = 1;


                for (CellPhone cellPhone : cellPhones) {
                    cellPhone.setId(a++);

                }


                    System.out.println("Lütfen sırasıyla verilen bilgileri giriniz !!");
                    System.out.println();
                    System.out.println("Cep telefonunun ürün adını giriniz : ");
                    CellPhone b = new CellPhone(a, 0, 0, 0, "", new Brand(1, "Samsung"), "128", "6.5", 4000, 6, "Siyah", 32);
                    input.nextLine();
                    String de2 = input.nextLine();

                    b.setName(de2);

                    System.out.println("Fiyat bilgisini giriniz :");
                    String unitePrice = input.nextLine();
                    double uniteP = Double.valueOf(unitePrice);

                    b.setUnitPrice(uniteP);

                    System.out.println("Marka id ve adını sırasıyla giriniz :");

                    System.out.println("id : ");
                    String idforB = input.nextLine();
                    int idforBrand = Integer.valueOf(idforB);
                    System.out.println("Adını giriniz:");

                    String nameForBrand = input.nextLine();
                    System.out.println("Rengini giriniz : ");

                    Brand ab = new Brand(idforBrand, nameForBrand);
                    b.setBrand(ab);
                    String color = input.nextLine();
                    b.setColor(color);
                    System.out.println("Batarya gücü : ");

                    int batteryPower = input.nextInt();
                    b.setBatteryPower(batteryPower);
                    System.out.println("Ram : ");
                    int ram = input.nextInt();
                    b.setRam(ram);
                    System.out.println("Kameranın Megapiksel(Mp) giriniz : ");
                    int camera = input.nextInt();
                    b.setCamera(camera);


                    cellPhones.add(b);



                System.out.println(cellPhones.get(a - 1).getName() + " " + "eklendi.");

            } else if (e.equals("d")) {
                System.out.println("Silinmesini istediğiniz Ceptelefonunun SIRA NUMARASINI  giriniz : ");


                try {
                    int d = input.nextInt();
                    cellPhones.remove(cellPhones.get(d - 1));

                } catch (IndexOutOfBoundsException exception) {
                    System.out.println("Lütfen arrayin sınırını aşmayacak bir index seçiniz !!");

                }


            }

        } else {
            System.out.println("Lütfen tekrar girdiniz hatalı giriş ");
        }
    }

    public void listCellPhone() {
        System.out.println("Available MobilePhone: ");
        System.out.println("Cep Telefonu Listesi");
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Formatter fmt = new Formatter();
        fmt.format("%s%15s%26s%13s%19s%12s%15s%20s%15s%20s%15s\n", "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM", "  İndirim Yüzdesi", "Renk", "Pil Gücü", "Kamera");

        // System.out.println("| ID | Ürün Adı                       | Fiyat     | Marka         | Depolama        |  Ekran | RAM    | İndirim Yüzdesi | Renk  |  Pil Gücü |");
        int count = 0;

        for (CellPhone cellPhone : cellPhones) {
            count++;
            fmt.format("%1s%27s%15s%15s%14s%14s%15s%13s%24s%17s%15s\n", count, cellPhone.getName(), cellPhone.getUnitPrice(), cellPhone.getBrand().getName(), cellPhone.getStorage(), cellPhone.getScreenSize(), cellPhone.getRam(), cellPhone.getDiscountRate(), cellPhone.getColor(), cellPhone.getBatteryPower(), cellPhone.getCamera());


       /*     System.out.println("|\s" + count + "\s\s|" + "\s" + cellPhone.getName() + "\t\t\t\s\s|\t" +
                    cellPhone.getUnitPrice() + "\t\t\s\s|\t" + cellPhone.getBrand().getName() + "\t\t\s\s|\t" + cellPhone.getStorage() +
                    "\t\t\t\t|\t" + cellPhone.getScreenSize() + "\s\s|\s" + cellPhone.getRam() + "\t\s\s|\s" + cellPhone.getDiscountRate() + "\t\t\t\t|\s" + cellPhone.getColor()
                    + "\t|\s\s" + cellPhone.getBatteryPower()
                    + "\t\s\t|\s\s");

        */
        }
        System.out.println(fmt);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


    }

    public void newProduct() {


    }


}