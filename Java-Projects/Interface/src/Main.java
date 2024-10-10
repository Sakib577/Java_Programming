// Interface is almost like abstract but we need to use implement instead of extend...
// And
interface Animal {
    int x= 5;
    int y= 15;
    public void animalsound();  // interface method doesn't have a body
    public void  run(); // interface method doesn't have a body
}

// To access the interface methods, the interface must be "implemented"
// (kinda like inherited) by another class with the implements keyword (instead of extends).
// The body of the interface method is provided by the "implement" class:

class Dog implements Animal {
    @Override
    public void animalsound() {
        System.out.println("The dog says: \"Bark Bark\"");
    }
    public void run() {
        System.out.println("Thomp Thomp");
    }
}

//Notes on Interfaces:
// 1. Like abstract classes, interfaces cannot be used to create objects (in the example above,
// it is not possible to create an "Animal" object in the MyMainClass)
//
// 2. Interface methods do not have a body - the body is provided by the "implement" class
//
// 3. On implementation of an interface, you must override all of its methods
//
// 4. Interface methods are by default abstract and public
// 5. Interface attributes are by default public, static and final
//
// 6. An interface cannot contain a constructor (as it cannot be used to create objects)

public class Main {
    public static void main(String[] args) {
        Dog mydog= new Dog();
        mydog.animalsound();
        mydog.run();
        System.out.println(mydog.x + mydog.y);
        // or,
        System.out.println(Animal.y - Animal.x);
    }
}