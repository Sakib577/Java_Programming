public class Polymorphism {
    public static void main(String[] args) {
        Animal myanimal =new Animal();
        Dog mydog = new Dog();
        Horse myhorse= new Horse();

        myanimal.animalsound();
        mydog.animalsound();
        myhorse.animalsound();
    }
}
