class Employee{
    int salary = 50000;
    public static void main(String[] args)
    {

        Programmer Total_salary = new Programmer();

        System.out.println("Basic salary:"+Total_salary.salary);
        System.out.println("Total salary:"+Total_salary.bonus);
    }
}
class Programmer extends Employee{
    int bonus = 10000;

}