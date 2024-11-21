package Inheritence1;
import java.util.Scanner;

public class Shape2 {
    double getperimeter(int r){
        return 0;
    }
    double getarea(int r){
        return 0;
    }
}

class Circle extends Shape2{
    @Override
    double getperimeter(int r) {
        return (2*Math.PI*r);
    }

    @Override
    double getarea(int r) {
        return Math.PI*Math.pow(r,2);
    }
}

class Call{
    public static void main(String[] args) {
        System.out.println("Enter the radius: ");
        Scanner input= new Scanner(System.in);
        Circle ob= new Circle();
        int r= input.nextInt();
        System.out.println("Perimeter: "+ ob.getperimeter(r));
        System.out.println("Area: "+ ob.getarea(r));
    }
}