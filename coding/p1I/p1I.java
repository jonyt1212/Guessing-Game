import java.io.*;
import java.util.*;

public class p1I{
    public static void main(String args[]){
        int password = 0;
        String username = " ";
        Scanner reader = new Scanner(System.in);
        while(username.equals("name") == false || password != 1234){
            System.out.println("Please enter your username: ");
            username = reader.next();
            System.out.println("Please enter your password: ");
            password = reader.nextInt();
            if(username.equals("name") && password == 1234){
                System.out.println("You have successfully logged in");
            }else{
                System.out.println("Login unsuccesful... try again");
            }
        }
    }
}