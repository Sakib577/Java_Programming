//Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
//
//Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void animalsound();
    int x=5, y=10;
    public void sleep()
    {
        System.out.println("Zzz");
    }
}

class Dog extends Animal {
    void animalsound() {
        System.out.println("The dog says: Bark Bark.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog mydog= new Dog();
        mydog.sleep();
        mydog.animalsound();
        System.out.println(mydog.x+ mydog.y);
    }
}