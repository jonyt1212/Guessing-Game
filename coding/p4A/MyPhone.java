public class MyPhone{
    public Song songLibrary[] = new Song[4];
    public String color;
    public double memoryCapacity;
    
    public MyPhone(String c, double mC){
        color = c;
        memoryCapacity = mC;
        songLibrary[0] = new Song("Alphabet Song", "preschool teacher", 0.99, 1, 45);
        songLibrary[1] = new Song("Twinkle Twinkle Little Star", "unknown", 0.33, 1, 30);
        songLibrary[2] = new Song("Itsy Bitsy Spider", "John", 3.99, 1, 60);
        songLibrary[3] = new Song("Up on the Rooftop", "Mrs. Claus", 9.99, 4, 210);
    }
    
    public int totalPlayTime(){
        int sum = 0;
        for(int i=0; i < songLibrary.length; i++){
            sum += songLibrary[i].getLengthInSecs();
        }
        return sum;
    }
    
    public void deleteAllSongs(){
        songLibrary[0] = null;
        songLibrary[1] = null;
        songLibrary[2] = null;
        songLibrary[3] = null;
    }
    
    public String toString(){
        return ("The color of the phone is " + color + ". It has " + memoryCapacity + " GB. It has " + songLibrary.length + " songs. " + songLibrary[0] + songLibrary[1] + songLibrary[2] + songLibrary[3]);
    }
}