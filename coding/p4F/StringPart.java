public class StringPart{
    private int start;
    private int length;
    
    public StringPart(int start, int length){
        this.start = start;
        this.length = length;
    }
    
    /**@return the starting position of the substring in a master string
     */
    public int getStart(){
        return start;
    }
    
    public int getLength(){
        return length;
    }
    
    public String toString(){
        return ("("+start+"," + length+")" );
    }
}