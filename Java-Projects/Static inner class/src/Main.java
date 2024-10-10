class Outerclass{
    int x= 10;
    static class Innerclass{
        int y=5;
    }
}

public class Main {
    public static void main(String[] args) {
        //An inner class can also be static, which means that you can access it without creating an object of the outer class:
        Outerclass.Innerclass myinner = new Outerclass.Innerclass();
        Outerclass myoutter= new Outerclass();
        System.out.println(myinner.y+myoutter.x);
    }
}