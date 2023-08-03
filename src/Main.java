

import java.util.*;

public class Main {

    public static void main(String[] args) {
        OrderByTotalPageComparator orderByTotalPageComparator= new OrderByTotalPageComparator();
        OrderByNameComparator orderByNameComparator = new OrderByNameComparator();
        TreeSet<Book> bookTreeSet = new TreeSet<>(orderByTotalPageComparator);
       // TreeSet<Book> bookTreeSet = new TreeSet<>(orderByNameComparator);


        bookTreeSet.add(new Book("Tutunamayanlar", 650, "Oğuz Atay", "26.05.1997"));
        bookTreeSet.add(new Book("Kiralık Konak", 232, "Oğuz Atay", "1922"));
        bookTreeSet.add(new Book("Yaprak Dökümü", 160, "Reşat Nuri Güntekin", "1930"));
        bookTreeSet.add(new Book("Kürk Mantolu Madonna", 159, "Reşat Nuri Güntekin", "1943 "));
        bookTreeSet.add(new Book("Amok Koşucusu", 60 ,"Stefan Zweig", "1922"));

        for (Book a : bookTreeSet
        ) {
            System.out.println(a.getName());
        }


    }

}
