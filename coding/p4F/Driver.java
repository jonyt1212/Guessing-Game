import java.util.List;
import java.util.ArrayList;

public class Driver{
    public static void main(String args[]){
        String str = "sixtyzipperswerequicklypickedfromthewovenjutebag";
        StringCoder test = new StringCoder(str);
        String a = "overeager";
        
        ArrayList<StringPart> b = test.encodeString(a);
        System.out.println(test.decodeString(b));
    }
}