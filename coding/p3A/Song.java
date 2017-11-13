public class Song{
    public String title;
    public String artist;
    public double cost;
    public int duration;
    private int lengthInSecs;
    
    
    public Song(String t, String a, double c, int d, int l){
        title = t;
        artist = a;
        cost = c;
        duration = d;
        lengthInSecs = l;
    }
    
    public String toString(){
        return ("The song " + title + " by " + artist + " costs $" + cost + ". It is a total of " + lengthInSecs + " seconds, which is roughly " + duration + " minutes long. " + convertToMinSecs());
    }
    
    public int getLengthInSecs(){
        return lengthInSecs;
    }
    
    public void setLengthInSecs(int num){
        lengthInSecs = num;
    }
    
    public String convertToMinSecs(){
        return ("The length of the song is exactly " + getMinutes() + " minutes and " + getSeconds() + " seconds.");
    }
    
    public int getMinutes(){
        return lengthInSecs/60;
    }
    
    public int getSeconds(){
        return lengthInSecs%60;
    }
}