import java.util.List;
import java.util.ArrayList;
public class MyPhone2{
    //public Song songLibrary[] = new Song[4];
    public String color;
    public double memoryCapacity;
    List<Song> songLibrary = new ArrayList<Song>();
    
    public MyPhone2(String c, double mC){
        color = c;
        memoryCapacity = mC;
        songLibrary.add(new Song("Alphabet Song", "preschool teacher", 0.99, 1, 45));
        songLibrary.add(new Song("Twinkle Twinkle Little Star", "unknown", 0.33, 1, 30));
        songLibrary.add(new Song("Itsy Bitsy Spider", "John", 3.99, 1, 60));
        songLibrary.add(new Song("Up on the Rooftop", "Mrs. Claus", 9.99, 4, 210));
    }
    
    public int totalPlayTime(){
        int sum = 0;
        for(int i=0; i < songLibrary.size(); i++){
            sum += songLibrary.get(i).getLengthInSecs();
        }
        return sum;
    }
    
    public void deleteAllSongs(){
        int currentSize = songLibrary.size();
        for(int i=currentSize-1; i>=0; i--){
            songLibrary.remove(i);
            songLibrary.add(i, null);
        }
    }
    
    public String toString(){
        return ("The color of the phone is " + color + ". It has " + memoryCapacity + " GB. It has " + songLibrary.size() + " songs. " + songLibrary.get(0) + songLibrary.get(1) + songLibrary.get(2) + songLibrary.get(3));
    }
}