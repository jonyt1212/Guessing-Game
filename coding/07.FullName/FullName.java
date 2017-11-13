import java.io.*;
import java.util.*;
public class FullName{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String first = reader.next();
        System.out.println("What is your last name? ");
        String last = reader.next();
        System.out.println("Your full name is " + first + " " + last);
    }
}