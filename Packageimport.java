import java.util.Scanner;
//import package.name.class;    for importing speicific class
//import package.name.*;        for importing whole package

public class Packageimport {
    public static void main(String[] args) {
        Scanner object1= new Scanner(System.in);
        System.out.println("Enter username:");

        String username = object1.nextLine();
        System.out.println("Username is: " + username);
    }
}
