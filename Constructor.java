public class Constructor {
    int x;
    int y;

    public Constructor() {// constructor
        x = 10;
    }

    public Constructor(int z) {// using parameter in a constructor
        y = z;
    }

    public static void main(String[] args) {
        Constructor object1 = new Constructor();
        System.out.println(object1.x);
        System.out.println(object1.y); // if I don't use parameter.

        Constructor object2 = new Constructor(20);
        System.out.println(object2.y);
    }
}
