
import generics.MyList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();



        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(30);
        liste.add(30);
        liste.add(40);




        System.out.println("Array : " + liste.toString());

        System.out.println("İndeksof : " + liste.indexOf(30));


        System.out.println("lastındex" + liste.lastIndexOf(40));





        Object[] dizi = liste.toArray();
        System.out.println("capasite" + liste.getCapacity());
        System.out.println("Object dizisinin ilk elemanı :" + dizi[4]);

        MyList<Integer> altListem =  liste.subList(0, 2);

        System.out.println(altListem.toString());
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));
        System.out.println("Array : " + liste.toString());

    }
}