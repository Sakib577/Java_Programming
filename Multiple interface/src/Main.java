// Why And When To Use Interfaces?
// 1) To achieve security - hide certain details and only show the important details of an object (interface).
// 2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces,
// because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma

interface Firstinterface{
    public void firstmethod();
}

interface Secondinterface{
    public void secondmethod();
}

class Demo implements Firstinterface, Secondinterface {
    public void firstmethod() {
        System.out.println("First method is printing.");
    }
    public void secondmethod() {
        System.out.println("Second method is printing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo obj= new Demo();
        obj.firstmethod();
        obj.secondmethod();
    }
}