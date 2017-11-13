import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
        BranchBanking bank = new BranchBanking();
        System.out.println("Welcome!");
        Scanner reads = new Scanner(System.in);
        String username, password;
        while(true){
            System.out.println("Username: ");
            username = reads.next();
            System.out.println("Password: ");
            password = reads.next();
            if(!bank.credentials(username, password)){
                System.out.println("Incorrect. Please enter again.");
            } else {
                break;
            }
        }
        System.out.println(bank.menu());
        bank.decision(reads.nextInt());
    }
}