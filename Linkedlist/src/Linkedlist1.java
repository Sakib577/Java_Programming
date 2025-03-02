// LinkedList class is almost identical to the ArrayList

import java.util.LinkedList;
import java.util.Collections; // We have to import Collections class to sort

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Honda");
        cars.add("Bmw");
        cars.add("Volvo");
        cars.add("Mercedes");
        System.out.println(cars);

        // Sorting an arraylist
        Collections.sort(cars);
        System.out.println(cars);

        // ArrayList vs. LinkedList
        // The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.
        //
        // The LinkedList class has all the same methods as the ArrayList class because they both implement the List interface.
        // This means that you can add items, change items, remove items and clear the list in the same way.
        //
        // However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
        //
        // How the ArrayList works
        // The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
        // If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.
        //
        // How the LinkedList works
        // The LinkedList stores its items in "containers." The list has a link to the first container and each container has a
        // link to the next container in the list. To add an element to the list, the element is placed into a new container and
        // that container is linked to one of the other containers in the list.


        // When To use.
        // use an ArrayList for storing and accessing data, and LinkedList to manipulate data.

        // addFirst()	Adds an item to the beginning of the list
        // addLast()	Add an item to the end of the list
        // removeFirst()	Remove an item from the beginning of the list
        // removeLast()	Remove an item from the end of the list
        // getFirst()	Get the item at the beginning of the list
        // getLast()	Get the item at the end of the list

        cars.addFirst("Ford");
        System.out.println("After using addFirst(): "+cars);

        cars.addLast("Lamborghini");
        System.out.println("After using addLast(): "+ cars);

        System.out.println("After using getFirst(): "+cars.getFirst());

        System.out.println("After using getLast(): "+ cars.getLast());

        cars.removeFirst();
        System.out.println("After using removeFirst(): "+cars);

        cars.removeLast();
        System.out.println("After using removeLast(): "+cars);

    }
}
