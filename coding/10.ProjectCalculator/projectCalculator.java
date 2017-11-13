import java.io.*;
import java.util.*;
public class projectCalculator{
    public static void main(String args[]){
        //This code should be placed inside the main method of a class
        System.out.println("Make your arithmetic selection from the choices below:\n");
        System.out.println("Add");
        System.out.println("Subtract");
        System.out.println("Multiply");
        System.out.println("Divide\n");
        System.out.print(" Your choice? ");
        Scanner kbReader = new Scanner(System.in);
        String choice = kbReader.next( );
        System.out.print("\nEnter first operand. " );
        double op1 = kbReader.nextDouble( );
        System.out.print("\nEnter second operand." );
        double op2 = kbReader.nextDouble( );
        System.out.println("");
        switch (choice)
        {
            case "add":
            case "Add"://addition
                System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
                break;
            case "Subtract": 
            case "subtract"://subtraction
                System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
                break;
            case "Multiply": //multiplication
            case "multiply":
                System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
                break;
            case "divide": //division
            case "Divide":
                System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2) );
                break;
            default:
             System.out.println("Hey dummy, enter only say Add, Subtract, Multiply, or Divide!");
} 
    }
}