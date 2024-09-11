public class Encapsulation {
    private String name;

    // public static void main(String[] args) {
    //     Encapsulation object1= new Encapsulation();
    //     object1.name= "Sakib";
    //     System.out.println(object1.name);
    // }
    //this works

    // as we can't use 
    public String getname() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

