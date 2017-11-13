import java.util.List;
import java.util.ArrayList;
public class p3F2{
    public static void main(String args[]){
        List<String> colleges = new ArrayList<String>();
        colleges.add("UCLA");
        colleges.add("USC");
        colleges.add("Berkeley");
        colleges.add("PENN");
        for(int i=0; i<colleges.size(); i++){
            if(colleges.get(i) != null){
                System.out.println(colleges.get(i));
            }
        }
        System.out.println("\n");
        for(String object: colleges){
            System.out.println(object);
        }
        
        colleges.remove(3);
        colleges.add(1, "Santa Clara");
        
        System.out.println("\n");
        for(String object: colleges){
            System.out.println(object);
        }
    }
}