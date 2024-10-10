class Outerclass{
    int x= 10;
    class Innerclass{
        int y=5;
        int Innermethod()
        {
            return x+y;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        //An inner class can also be static, which means that you can access it without creating an object of the outer class:
        Outerclass myoutter= new Outerclass();
        Outerclass.Innerclass myinner = myoutter.new Innerclass();

        System.out.println(myinner.y+myoutter.x);
        System.out.println(myinner.Innermethod());
    }
}