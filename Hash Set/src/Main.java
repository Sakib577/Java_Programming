// A HashSet is a collection of items where every item is unique
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("BMW");

        System.out.println(cars);
        // even though BMW is added twice it only appears once in the set because every item in a set has to be unique.

        System.out.println(cars.contains("Ford"));
        // To check whether an item exists in a HashSet, use the contains() method

        // To remove an item, use the remove() method
        // To remove all items, use the clear() method

        System.out.println("Size: "+cars.size());

        for (String i: cars)
            System.out.println(i);

        HashSet<Integer> nums= new HashSet<>();
        nums.add(10);
        nums.add(8);
        nums.add(3);

        for (int i= 1; i <= 10; i++)
        {
            if (nums.contains(i))
                System.out.println(i + " was found in the set.");
            else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}