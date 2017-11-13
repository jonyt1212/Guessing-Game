import java.util.List;
import java.util.ArrayList;

public class StringCoder{
    private String masterString;
    
    /**@param master the master string for the StringCoder
     *      Precondition: the master string contains all the letters of the alphabet
     */
    public StringCoder(String master){
        masterString = master;
    }
    
    /**@param parts an ArrayList of string parts that are valid in the master string
     *       Precondition: parts.size()>0
     * @return the string obtained by concatenating the parts of the master string
     */
    public String decodeString(ArrayList<StringPart> parts){
        String returner = "";
        for(StringPart obj: parts){
            returner += masterString.substring(obj.getStart(), obj.getStart()+obj.getLength());
        }
        return returner;
    }
    
    /**@param str the string to encode using the master string
     *      Precondition: all of the characters in str appear in the master string;
     *          str.length()>0
     * @return a string part in the master string that matches the beginning of str
     *          The returned string part has a length of at least 1
     */
    private StringPart findPart(String str){
        String part = str;
        StringPart returner = null;
        for(int i=0; i<str.length(); i++){
            if(masterString.indexOf(part) != -1){
                //use the index & length of part
                returner = new StringPart(masterString.indexOf(part), part.length());
            } else {
                part = part.substring(0, part.length()-1);
            }
        }
        return returner;
    }
    
    
    /**@param word the string to be encoded
     *      Precondition: all of the characters in word appear in the master string;
     *          word.lenght() > 0
     * @ return an ArrayList of string parts of the master string that can be combined
     *          to create word
     */
    public ArrayList<StringPart> encodeString(String word){
        ArrayList<StringPart> encodedStr = new ArrayList<StringPart>();
        int length = 0;
        StringPart adder;
        String str = word;
        while(length != word.length()){
            adder = findPart(str);
            encodedStr.add(adder);
            length += adder.getLength();
            str = str.substring(adder.getLength());
        }
        return encodedStr;
    }
    
}