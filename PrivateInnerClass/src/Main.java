class Outerclass {
    int x= 10;
     private class Innerclass{
        int y= 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Outerclass myouter= new Outerclass();
        Outerclass.Innerclass myinner= myouter.new Innerclass();
        System.out.println(myinner.y + myouter.x);
        //This will not work because the inner class is private.
    }
}