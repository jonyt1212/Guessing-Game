import java.util.List;
import java.util.ArrayList;
public class p4C{
    public static void main(String args[]){
        List<String> collegeList = new ArrayList<String>();
        collegeList.add("UCLA");
        collegeList.add("USC");
        collegeList.add("Berkeley");
        collegeList.add("PENN");
        collegeList.add("UCI");
        collegeList.add("UMass");
        collegeList.add("Army");
        collegeList.add("Navy");
        
        for(String object: collegeList){
            System.out.println(object);
        }
        System.out.println("\n\n");
        int size = collegeList.size();
        for(int i = size-1; i>=0; i--){
            if(collegeList.get(i).length()==4){
                collegeList.remove(i);
            }
        }
        
        for(String object: collegeList){
            System.out.println(object);
        }
        
        
    }
}