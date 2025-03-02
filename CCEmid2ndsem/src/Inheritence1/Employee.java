package Inheritence1;

public class Employee {
    void work(){
        System.out.println("Working...");
    }
    void getSalary(){
        System.out.println("Salary is paid...");
    }
}

class HRManager extends Employee{
    void work(){
        System.out.println("Working as Human Resource Manager...");
    }
    void addEmployee(){
        System.out.println("Employee is added...");
    }
}
class Boss{
    public static void main(String[] args) {
        Employee obp= new Employee();
        HRManager obc= new HRManager();
        obp.work();
        obp.getSalary();
        System.out.println();
        obc.work();
        obc.addEmployee();
        obc.getSalary();
    }
}
