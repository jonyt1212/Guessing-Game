public class BankAccount{
    public double balance; //how much money currently in account
    public String name; //name of person owning account
    
    public BankAccount(double b, String n){
        balance = b;
        name = n;
    }
    
    public void deposit(double d){
        balance += d;
    }
    
    public void withdraw(double t){
        balance -= t;
    }
}