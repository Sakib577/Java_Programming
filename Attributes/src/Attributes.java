public class Attributes {

    int x=10;
    final int y=15;
    public static void main(String[] args) throws Exception {
        Attributes object= new Attributes();
        object.x=20;
        System.out.println(object.x);
        object.x=18;
        System.out.println(object.x);
        //We can't change a final attribute
        System.out.println(object.y);
        Attributes object3= new Attributes();
        System.out.println(object3.x+" "+ object3.y);

    }
}
