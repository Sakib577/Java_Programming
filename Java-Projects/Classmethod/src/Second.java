class Classmethod {

    static void staticmymethod(){
        System.out.println("This is the static method. This can be called without creating methods.");
    }

    public void publicmymethod(){
        System.out.println("This is the public method. This cannot be called without creating methods.");
    }

    void defaultmymethod(){
        System.out.println("This is the default my method. Which acts like a public method.");
    }

    void x(int x){
        System.out.println("x+3= " + (x + 3));
    }

}



public class Second {

    public static void main(String[] args) {
        Classmethod.staticmymethod();
        
        Classmethod object1= new Classmethod();
        object1.publicmymethod();
        

        object1.defaultmymethod();

        object1.x(200);
    }
}