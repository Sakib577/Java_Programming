class Abstractextra {
    public static void main(String[] args) {
        Student obj1= new Student();

        System.out.println("Name: " + obj1.fname);
        System.out.println("Age: " + obj1.age);
        System.out.println("Graduation year: " + obj1.gradyear);

        obj1.study(); //calls the abstract method.
    }
}
