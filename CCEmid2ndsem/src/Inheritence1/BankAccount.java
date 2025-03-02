package Inheritence1;
import java.util.Random;
import java.util.Scanner;

public class BankAccount {
    Random ran=new Random();
    int balance= ran.nextInt(1,500);
    int deposit(int x){
        balance=balance+x;
        return balance;
    }
    int withdraw(int x){
        balance=balance-x;
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    int withdraw(int x){
        if (balance < 100){
            System.out.println("You can't withdraw if your balance is less than 100.");
            return balance;
        }
        else return super.withdraw(x);
    }
}

class ATM{
    public static void main(String[] args) {
        SavingsAccount ob=new SavingsAccount();
        Scanner in= new Scanner(System.in);
        System.out.println("Balance: " + ob.balance);
        System.out.println("Deposit ammount: ");
        int ammount= in.nextInt();
        System.out.println("Now your balance: " + ob.deposit(ammount));

        System.out.println("Withdraw ammount: ");
        ammount= in.nextInt();
        System.out.println("Now your balance: " + ob.withdraw(ammount));
    }
}
