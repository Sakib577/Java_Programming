import java.util.ArrayList;
import java.util.Collections; // We have to import Collections class to sort

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(20);
        nums.add(5);
        nums.add(15);
        nums.add(30);
        System.out.println(nums);

        // Sorting an arraylist
        Collections.sort(nums);
        System.out.println(nums);
    }
}
