import java.io.*;
import java.util.*;
public class Tester{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        double money = reader.nextDouble();
        System.out.println("Enter your name: ");
        String peron = reader.nextLine();
        String person = reader.nextLine();
        
        BankAccount myAccount = new BankAccount(money, person);
        myAccount.deposit(505.22);
        System.out.println(myAccount.balance);
        myAccount.withdraw(100);
        System.out.println("The " + person + " account balance is, " + myAccount.balance);
    }
}