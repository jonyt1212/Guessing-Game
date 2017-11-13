import java.io.*;
import java.util.*;

public class ClockDriver{
    public static void main(String args[]){
        Clock bedroomClock = new Clock();
        System.out.println(bedroomClock);
        bedroomClock.setTime(7, 27, 45);
        System.out.println(bedroomClock);
        bedroomClock.convertDaylightSaving(-1);
        System.out.println(bedroomClock);
    }
}