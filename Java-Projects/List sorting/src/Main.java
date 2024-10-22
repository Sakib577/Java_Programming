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

        Collections.reverse(num);

        System.out.println("After reversing: "+ num);

        Collections.sort(num, Collections.reverseOrder());
        // It is only used for make the order descending.

        System.out.println("After reverse sorting or Descending: "+num);

        // OR,

        num.sort(Collections.reverseOrder());

        System.out.println("After reverse sorting or Descending: "+num);

        Collections.sort(num);
        // It is sorting in ascending order
        System.out.println("After sorting: "+num);


    }
}