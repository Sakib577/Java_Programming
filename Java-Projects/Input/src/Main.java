import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");

        String usrnm= input.nextLine();
        System.out.println("Your name is " + usrnm +".");
    }
}
//nextBoolean()	Reads a boolean value from the user
//nextByte()	Reads a byte value from the user
//nextDouble()	Reads a double value from the user
//nextFloat()	Reads a float value from the user
//nextInt()	    Reads a int value from the user
//nextLine()	Reads a String value from the user
//nextLong()	Reads a long value from the user
//nextShort()	Reads a short value from the user