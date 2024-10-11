import java.util.LinkedList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> num= new LinkedList<>();
        num.add(23);
        num.add(35);
        num.add(24);
        num.add(56);
        num.add(12);
        num.add(25);

        System.out.println("Before sorting: "+ num);

        Collections.sort(num);

        System.out.println("After sorting: "+num);

        // reverse the order

        Collections.sort(num, Collections.reverseOrder());

        System.out.println("After reverse sorting: "+num);
    }
}