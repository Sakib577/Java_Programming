package Inheritence1;
import java.util.Scanner;
public class Person {
    String fname;
    String lname;
    String jobTitle;
    int ID;
    Scanner in= new Scanner(System.in);
    void getfname(){
        System.out.println("Enter first name: ");
        fname=in.nextLine();
    }
    void getLname(){
        System.out.println("Enter last name: ");
        lname=in.nextLine();
    }
}

class EmployeePerson extends Person{
    void getEmployeeID(){
        System.out.println("Enter employee id: ");
        ID=in.nextInt();
    }

    @Override
    void getLname() {
        System.out.println("Enter last name: ");
        lname=in.nextLine();
        System.out.println("Enter job title: ");
        jobTitle=in.nextLine();
    }
}

class BossOfPerson{
    public static void main(String[] args) {
        EmployeePerson ob= new EmployeePerson();
        ob.getfname();
        ob.getLname();
        ob.getEmployeeID();

        System.out.println("Your name is: "+ob.fname+" "+ ob.lname);
        System.out.println("Your id: "+ob.ID);
        System.out.println("Your job title: "+ob.jobTitle);
    }
}