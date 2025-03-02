class Vehicle { //if we want to make a class which can not inherit a subclass.
                //we need to use final keyword before class keyword.
    protected String brand ="Ford";         //vehicle attribute
    public void honk(){                     //Vehicle method
        System.out.println("Tut, tut!");
    }
}

class Motorbike{
    public String mb="Honda";
}