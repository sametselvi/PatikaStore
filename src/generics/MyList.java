package generics;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;


public class MyList<T> {
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private T[] theArray;
    private int numItems;
    private int capacity;

    public int getCapacity() {

        return capacity;
    }

    public T[] getTheArray() {
        return theArray;
    }

    public void setTheArray(T[] theArray) {
        this.theArray = theArray;
    }

    public MyList() {
        setCapacity(10);
        setTheArray((T[]) new Object[getCapacity()]);


    }

    public MyList(int capacity) {
        this.capacity = capacity;
        setTheArray((T[]) new Object[capacity]);
        numItems = 0;


    }

    private void growArray() {

        T[] tempArr = (T[]) new Object[theArray.length * 2];

        for (int i = 0; i < numItems; i++) {
            tempArr[i] = (T) theArray[i];


        }
        theArray = tempArr;
    }

    public void add(T data) {
        theArray[numItems] = data;

        numItems++;

        if (numItems == theArray.length) {
            growArray();

        }


    }


    public T get(int index) {

        if (index > theArray.length) {
            return null;
        }


        return theArray[index];

    }

    public int size() {


        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public int getNumItems() {
        return numItems;
    }

    public boolean remove(Integer index) {


        if (numItems > 0) {

            for (int i = index; i < numItems - 1; i++) {


                theArray[i] = theArray[i + 1];
            }

            theArray[numItems - 1].equals(0);


            numItems--;
        }


        return false;
    }


    public void set(int index, int data) {


        Array.set(theArray, index, data);
    }

    public String toString() {
        int a=0;


//        Arrays.toString(theArray)

        if (theArray == null)
            return "null";

        int iMax = theArray.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');

        for (int i = 0; ; i++) {





            b.append(String.valueOf(theArray[i]));
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");


        }




    }

    public boolean contains(T element) {
        boolean a = false;


        for (T t : theArray) {
            if (t == element) {
                a = true;
            }

        }


        return a;
    }


    public int indexOf(T data) {

        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == data) {

                return i;
            }

        }

        return -1;
    }

    public int lastIndexOf(T element) {
        int currIndex = numItems - 1;

        while (currIndex >= 0) {
            if (theArray[currIndex] == element)
                return currIndex;
            currIndex--;
        }
        return -1;


    }

    public boolean isEmpty() {
        boolean a = true;
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] != null) {
                a = false;
                break;

            }

        }
        return a;
    }

    public T[] toArray() {

        T[] newArray = (T[]) new Object[theArray.length];

        for (int i = 0; i < theArray.length; i++) {
            newArray[i] = (T) theArray[i];


        }

        newArray = theArray;


        return newArray;
    }

    public void clear() {
        capacity = 0;

        T[] b = (T[]) new Object[capacity];


        for (T t : theArray = (T[]) b) {
            System.out.println(theArray);

        }
        theArray = b;


    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || start > theArray.length || finish < 0 || finish > theArray.length)
            return null;


        MyList<T> returnedList = new MyList<>(finish - start);

        for (int i = start; i < finish; i++) {
            returnedList.add(theArray[i]);
        }

        return returnedList;

    }


}
















