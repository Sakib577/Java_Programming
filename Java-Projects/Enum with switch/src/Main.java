enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main {
    public static void main(String[] args) {
        Level mylev= Level.MEDIUM;

        switch (mylev) {
            case LOW -> System.out.println("Low level.");
            case MEDIUM -> System.out.println("Medium level.");
            case HIGH -> System.out.println("HIgh level.");
        }

        // Or,

        switch (mylev) {
            case LOW:
                System.out.println("LOW LEVEL.");
                break;
            case MEDIUM:
                System.out.println("MEDIUM LEVEL.");
                break;
            case HIGH:
                System.out.println("HIGH LEVEL.");
                break;

        }
    }
}