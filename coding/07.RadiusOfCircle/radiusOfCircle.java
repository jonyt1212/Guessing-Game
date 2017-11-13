import java.io.*;
import java.util.*;
public class radiusOfCircle{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is the area? _ ");
        double area = reader.nextDouble();
        double radius = Math.sqrt(area/Math.PI);
        
        System.out.println("Radius of your circle is "+ radius);
    }
}