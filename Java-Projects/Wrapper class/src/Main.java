public class Main {
    public static void main(String[] args) {
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // For example, the following methods are used to get the value associated with the corresponding wrapper object:
        // intValue(), byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue()

        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // The result is the same

        // toString() method, which is used to convert wrapper objects to strings
        Integer x= 234;
        String convertedString= x.toString();
        System.out.println(convertedString.length());
    }
}