import java.io.*;
import java.util.*;

public class createNewPassword{
    public static void main(String args[]){
        Scanner scansStuff = new Scanner(System.in);
        int nonAlphaNum;
        boolean goodCode = false;
        while(goodCode == false){
            goodCode = true;
            System.out.println("Enter password: ");
            String password = scansStuff.next();
            nonAlphaNum = 0;
            if(password.length() < 6){
                goodCode = false;
                System.out.println("Your password needs to be at least 6 characters long.");
            }
            for(int i=0; i<password.length(); i++){
                if(i != password.length()-1){
                    if(password.substring(i, i+1).equals("+") || password.substring(i, i+1).equals("-") || password.substring(i, i+1).equals("*") || password.substring(i, i+1).equals("/") || password.substring(i, i+1).equals("@")){
                        nonAlphaNum++;
                    }
                } else{
                    if(password.substring(i).equals("+") || password.substring(i).equals("-") || password.substring(i).equals("*") || password.substring(i).equals("/") || password.substring(i).equals("@")){
                        nonAlphaNum++;
                    }
                }
            }
            if(nonAlphaNum < 1){
                goodCode = false;
                System.out.println("You need at least one non-alphanumeric character.");
            }
        }
    }
}