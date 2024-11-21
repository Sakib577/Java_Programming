import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> itrt= cars.iterator();

        // Print the first item
        System.out.println(itrt.next());

        // Print the second item
        System.out.println(itrt.next());

        //which means .next() method is iterating every single time it is executed.
    }
}
