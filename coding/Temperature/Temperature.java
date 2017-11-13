import java.io.*;
import java.util.*;
public class Temperature{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        //int arrLength = 5;
        int[] temp = new int[100];
        int inputTemp;
        int i = 0;
        System.out.println("Enter the temperatures");
        System.out.println("Temperature: ");
        while(true){
            inputTemp = reader.nextInt();
            System.out.println("i: " + i);
    //should be NOT eqUAL
            if(errorCheck(temp, inputTemp, i)){
                temp[i] = inputTemp;
                i++;
                System.out.println("Temperature: ");
            } else{
                if(inputTemp == -453){
                    System.out.println("In break loop");
                    break;
                } else{
                    System.out.println("Re-enter the temperature: ");
                }
            }
        }
    }
    
    public static boolean errorCheck(int[] arr, int input, int i){
        boolean checker = true;
        if(i==0 && input == -453){
            System.out.println("4sfs");
            checker = false;
        } else if(input < -140 || input > 140){ 
            checker = false;
        } else if(i>= 5 && input == arr[i-1] && input == arr[i-2] && input == arr[i-3] && input == arr[i-4]) {
            checker = false;
        }
        System.out.println(checker);
        return checker;
    }
}