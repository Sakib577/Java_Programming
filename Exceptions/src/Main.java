// The try statement allows you to define a block of code to be tested for errors while it is being executed.
//
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//
//The try and catch keywords come in pairs

public class Main {
    public static void main(String[] args) {
        int[] nums= {2,4,6,7,8};
        try {
            System.out.println(nums[10]); // error as index 10 doesn't exist
        } catch (Exception e)
        {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("Code is executed with finally");
        }

        System.out.println("Hi");

    }
}