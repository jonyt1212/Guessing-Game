import java.io.*;
import java.util.*;
public class NegativeWord{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String[] input = new String[100];
        String[] words = new String[4];
        int[] wordCount = new int[4];
        words[0] = "cheat";
        words[1] = "steal";
        words[2] = "lie";
        words[3] = "hate";
        int cheat, steal, lie, hate, i;
        cheat = steal = lie = hate = i = 0;
        String str;
        System.out.println("Enter a word: ");
        while(true){
            //gets words from the user
            str = reader.next();
            if(str.equals("stop")){
                //breaks if the user inputs "stop"
                break;
            }
            input[i] = str;
            System.out.println("Enter a word: ");
            i++;
        }
        System.out.println(i);
        for(int x = 0; x<i; x++){
            //counts how many of each of the negative words were inputted
            if(input[x].equals(words[0])){
                cheat++;
            } else if(input[x].equals(words[1])){
                steal++;
            }else if(input[x].equals(words[2])){
                lie++;
            }else if(input[x].equals(words[3])){
                hate++;
            }
        }
        wordCount[0] = cheat;
        wordCount[1] = steal;
        wordCount[2] = lie;
        wordCount[3] = hate;
        
        int percent = count(i, wordCount);
        
        System.out.println("NEGATIVE WORDS\t\tFOUND");
        System.out.println("cheat\t\t"+ wordCount[0]);
        System.out.println("steal\t\t"+ wordCount[1]);
        System.out.println("lie\t\t"+ wordCount[2]);
        System.out.println("hate\t\t"+ wordCount[3]);
        System.out.println("**" + percent + "% of the words entered are negative words.");
    }
    
    public static int count(int i, int[] arr){
        //finds the ratio of negative numbers to all the numbers inputted
        int numNeg = 0;
        for(int y = 0; y < 4; y++){
            //finds adds together all negative words
            numNeg+= arr[y];
        }
        double ratio = (double)numNeg/i * 100;
        ratio = Math.round(ratio);
        int percent = (int)ratio;
        return percent;
    }
}