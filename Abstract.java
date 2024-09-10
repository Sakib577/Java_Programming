abstract class Abstract {
    public String fname ="Sakib";
    public int age = 24;
    public abstract void study(); // Abstract method
}

//subclass extands from Abstract
class Student extends Abstract {
    public int gradyear = 2024;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
//end code of this file
