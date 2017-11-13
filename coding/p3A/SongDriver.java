public class SongDriver{
    public static void main(String args[]){
        Song music = new Song("Lullaby", "unknown", 17.99, 3, 213);
        System.out.println(music.getLengthInSecs());
        music.setLengthInSecs(222);
        System.out.println(music.getLengthInSecs());
        System.out.println(music);
        System.out.println(music.getMinutes());
        System.out.println(music.getSeconds());
    }
}