public class SongDriver{
    public static void main(String args[]){
        Song wakeUpSong = new Song();
        System.out.println(wakeUpSong);
        Song goToSleepSong = new Song("Lullaby", "unknown", 17.99, 3.30);
        System.out.println(goToSleepSong);
    }
}