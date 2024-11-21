package Inheritence1;

class Parent {
    // Private method in parent class
    private void display() {
        System.out.println("This is parent class");
    }

    // Public method to call the private method within the class
    public void callDisplay() {
        display();
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1 - Method of parent class by object of parent class
        Parent parentObj = new Parent();
        parentObj.callDisplay(); // Outputs: This is parent class

        // 2 - Method of child class by object of child class
        Child childObj = new Child();
        childObj.show(); // Outputs: This is child class

        // 3 - Attempt to call private method of parent class by object of child class
        // childObj.display(); // This will cause a compile-time error
    }
}
