import java.util.*;
public class AscendDescend{
    public static void main(String args[]){
        String ss[] = new String[] {"Bill","Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        System.out.println("Ascend \t\t Descend\n");
        for(int i=0; i<ss.length; i++){
            System.out.println(ss[i] + "             " + ss[ss.length -1 -i]);
        }
    }
}