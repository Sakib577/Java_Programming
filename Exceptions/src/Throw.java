// The throw statement allows you to create a custom error

// There are many exception types available in Java: ArithmeticException, FileNotFoundException,
// ArrayIndexOutOfBoundsException, SecurityException, etc

public class Throw {
    static void checkage(int age) {
        if (age < 18){
            throw new ArithmeticException("Access denied.");
    } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        // checkage(15);
        checkage(23);
    }
}