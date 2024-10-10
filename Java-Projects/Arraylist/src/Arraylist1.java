//The ArrayList class is a resizable array

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        // or, ArrayList<String> cars = new ArrayList<>();
        // We can skip declaring String.

        // add using add() method
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("BMW");

        System.out.println("normally: "+cars);

        // You can also add an item at a specified position by referring to the index number

        cars.add(1, "Honda");
        System.out.println("After adding Honda to index 1: "+cars);
        // It moves every element by 1 index

        // Accessing a single item is done by get() method
        System.out.println("To get single element: "+cars.get(2));

        // To modify an element, use the set() method and refer to the index number
        cars.set(2, "Mazda");
        System.out.println("After modifying index2: "+cars);

        // To remove an element, use the remove() method and refer to the index number
        cars.remove(0);
        System.out.println("After removing index 0: "+cars);

        // To find out how many elements an ArrayList have, use the size method
        System.out.println("Size: "+cars.size());

        // Loop through an Arraylist
        System.out.println("Loop: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // or, using for-each loop
        System.out.println("For-each loop: ");
        for (String i: cars) {
            System.out.println(i);
        }



        // To remove all the elements in the ArrayList, use the clear() method
        cars.clear();
        System.out.println("After clearing all elements: " + cars);

    }
}