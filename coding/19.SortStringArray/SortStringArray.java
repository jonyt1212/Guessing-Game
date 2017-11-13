import java.util.*;
public class SortStringArray{
    public static void main(String args[]){
        String ss[] = new String[] {"Bill","Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
        Arrays.sort(ss);
        for(String obj: ss){
            System.out.println(obj);
        }
    }
}