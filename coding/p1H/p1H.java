public class p1H{
    public static void main(String args[]){
        String[] artists = new String[3];
        String artist;
        artists[0] = "Jon Balloon";
        artists[1] = "Lorde";
        artists[2] = "Beyonce";
        
        for(int i=0; i<artists.length; i++){
            if(i<2){
                System.out.print(artists[i] + ", ");
            } else{
                System.out.print(artists[i]);
            }
        }
        
        System.out.print("\n");
        artists[(int)(Math.random()*2)] = "Micheal Jackson";
        
        for(int a=0; a<artists.length; a++){
            if(a<2){
                System.out.print(artists[a] + ", ");
            } else{
                System.out.print(artists[a]);
            }
        }
        
        System.out.println("\n");
        
        for(int b=0; b<artists.length; b++){
            artist = artists[b];
            if(artist.equals("Micheal Jackson")){
                System.out.println("We found Michael!");
            } else{
                System.out.println("No Michael in artists[" + b + "]");
            }
        }
    }
}