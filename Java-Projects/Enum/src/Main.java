// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//
// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
// Note that they should be in uppercase letters
// Enum is short for "enumerations", which means "specifically listed".

enum Level {
    LOW,
    Medium,
    high
}
public class Main {
    //inner enum
    enum level2 {
        EASY,
        NORMAL,
        HARD
    }
    public static void main(String[] args) {
        Level myVar = Level.Medium;
        System.out.println(myVar);
        level2 myvar =level2.EASY;
        System.out.println(myvar);
    }
}