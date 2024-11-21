package Inheritence1;
import java.util.Scanner;

public class Shape {
    int x,y;
    float getArea(int x, int y){
        return 0;
    }
}
class Rectangle extends Shape{
    @Override
    float getArea(int x, int y) {
        int area= this.x*this.y;
        return area;
    }
}

class Area{
    public static void main(String[] args) {
        Rectangle ob= new Rectangle();
        Scanner in=new Scanner(System.in);
        System.out.println("Input height and weight simultaneously: ");

        ob.x=in.nextInt();
        ob.y=in.nextInt();

        System.out.println(ob.getArea(ob.x,ob.y));
    }
}
