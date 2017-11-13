public class CardDriver{
    public static void main(String args[]){
        Card blank = new Card();
        Card num = new Card(7, null, "Clubs");
        Card face = new Card(10, "Queen", "Hearts");
        
        Card[] myHand = {blank, face, num};
        
        for(int i = 0; i<myHand.length; i++){
            System.out.println(myHand[i]);
        }
    }
}