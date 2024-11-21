import java.util.ArrayList;
import java.util.Iterator;

public class Loop {
    static public void main(String... args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> itrt= cars.iterator();

        while (itrt.hasNext())
            System.out.println(itrt.next());

        // Removing Items from a Collection
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(34);
        nums.add(42);
        nums.add(5);
        nums.add(8);
        nums.add(15);
        nums.add(45);

        System.out.println("Without removing: "+ nums);

        Iterator<Integer> itrt2= nums.iterator();
        while (itrt2.hasNext())
        {
            if (itrt2.next() < 10)
                itrt2.remove();

        }
        System.out.println("After removing: "+nums);

    }
}
