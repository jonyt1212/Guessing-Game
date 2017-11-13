import java.io.*;
import java.util.*;

public class ClockDriver{
    public static void main(String args[]){
        Clock kitchenClock = new Clock();
        System.out.println(kitchenClock);
        
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the hour?");
        int hour = reader.nextInt();
        System.out.println("What is the minute?");
        int minute = reader.nextInt();
        System.out.println("What is the second?");
        int second = reader.nextInt();
        Clock bedroomClock = new Clock(hour, minute, second);
        System.out.println(bedroomClock);
    }
}