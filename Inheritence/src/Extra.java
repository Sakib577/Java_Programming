class Extra {
    public static void main(String[] args) {
        Vehicle ob=new Vehicle();
        ob.honk();

        Car mycar=new Car();

        Motorbike bike= new Motorbike();
        System.out.println("My car is "+ob.brand+ " "+ mycar.modelname + ". And my bike is "+bike.mb);
        System.out.println("Also my "+ mycar.brand+" "+mycar.modelname+" is a new one.");
    }
}
