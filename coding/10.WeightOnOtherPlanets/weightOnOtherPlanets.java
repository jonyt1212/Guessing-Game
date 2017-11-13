import java.io.*;
import java.util.*;
public class weightOnOtherPlanets{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your weight in pounds?");
        double dWeight = reader.nextDouble();
        
        System.out.println("Type the number of the planet do you want to go to:");
        System.out.println("1\tVoltar \n2\tKrypton \n3\tFertos \n4\tServontos");
        int planet = reader.nextInt();
        
        switch(planet){
            case 1:
                System.out.println("You will weigh " + (dWeight * 0.091) + " pounds on planet Voltar");
                break;
                
            case 2:
                System.out.println("You will weigh " + (dWeight * 0.720) + " pounds on planet Kyrpton");
                break;
                
            case 3:
                System.out.println("You will weigh " + (dWeight * 0.865) + " pounds on planet Fertos");
                break;
                    
            case 4: 
                System.out.println("You will weigh " + (dWeight * 4.612) + " pounds on planet Servontos");
                break;
                
            default:
                System.out.println("Only write 1, 2, 3, or 4 please.");
        }
    }
}