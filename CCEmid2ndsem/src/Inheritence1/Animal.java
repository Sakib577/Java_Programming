package Inheritence1;

public class Animal {
    public void makesound(){
        System.out.println("Bark...");
    }
    public static void main(String[] args) {
        Cat ob= new Cat();
        ob.makesound();
    }
}

class Cat extends Animal{
    @Override
    public void makesound() {
        System.out.println("Meow..");
    }
}


