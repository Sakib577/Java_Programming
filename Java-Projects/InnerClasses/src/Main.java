public class Main {
    public static void main(String[] args) {
        Outerclass myout= new Outerclass();
        Outerclass.Innerclass myin= myout.new Innerclass();
        System.out.println(myin.y + myout.x);
    }
}