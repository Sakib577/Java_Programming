// store items in "key/value" pairs
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> capitalcities= new HashMap<>();
        // or, HashMap<String, String> capitalities = new HashMap<String, String>();

        // Add keys and values (Country, City) using put() method
        capitalcities.put("England","London");
        capitalcities.put("Bangladesh", "Dhaka");
        capitalcities.put("Germany", "Berlin");
        capitalcities.put("USA","Washington DC");

        System.out.println(capitalcities);

        System.out.println(capitalcities.get("USA"));

        capitalcities.remove("England");
        System.out.println("After removing england: "+ capitalcities);

        System.out.println("Size: "+ capitalcities.size());

        // Looping
        System.out.println("Loop");
        // Printing values
        for (String i: capitalcities.values())
            System.out.println(i);
        //Printing keys and values
        for (String i: capitalcities.keySet())
            System.out.println("Key: "+ i + " Value: "+ capitalcities.get(i));

        capitalcities.clear();
        System.out.println("After clearing the hashmap: "+ capitalcities);
    }
}