public class Song{
    public String title;
    public String artist;
    public double cost;
    public double duration;
    
    public Song(){
        title = null;
        artist = null;
        cost = 0;
        duration = 0;
    }
    
    public Song(String t, String a, double c, double d){
        title = t;
        artist = a;
        cost = c;
        duration = d;
    }
    
    public String toString(){
        return ("The song " + title + " by " + artist + " is " + duration + " minutes long and costs $" + cost);
    }
}