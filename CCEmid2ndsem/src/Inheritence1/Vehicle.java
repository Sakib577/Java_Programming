package Inheritence1;

public class Vehicle {
    void drive(){
        System.out.println("Vroom Vroom");
    }

    public static void main(String[] args) {
        Car ob= new Car();
        ob.drive();
    }
}

class Car extends Vehicle{
    @Override
    void drive() {
        System.out.println("Car is repairing.");
    }
}