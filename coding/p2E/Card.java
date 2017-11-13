public class Card{
    public int num;
    public String suit;
    public String face;
    
    public Card(){
        num = 0;
        face = null;
        suit = null;
    }
    
    public Card(int n, String f, String s){
        num = n;
        face = f;
        suit = s;
    
    }
    
    public String toString(){
        if(!(face == null || face.equals(""))){
            return "The card is " + face + " of " + suit + " and is worth " + num;
        } else {
            return "The card is " + num + " of " + suit + " and is worth " + num;
        }
    }
}