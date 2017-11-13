public class p1E{
    public static void main(String[] args){
        String[] favorites = new String[6];
        int x = 3;
        
        favorites[0] = "Up";
        favorites[1] = "ET";
        favorites[2] = "It";
        favorites[3] = "The Macarena";
        favorites[4] = "Itsy Bitsy Spider";
        favorites[5] = "Happy Birthday";
        
        
        for(int i = 0; i < 3; i++){
            if(i<2){
                System.out.print(favorites[i] + ", ");
            } else{
                System.out.print(favorites[i]);
            }
        }
        
        System.out.print("\n");
        
        while(x<6){
            if(x<5){
                System.out.print(favorites[x] + ", ");
            } else{
                System.out.print(favorites[x]);
            };
            x++;
        }
    }
}