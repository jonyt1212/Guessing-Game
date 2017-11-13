import java.util.List;
import java.util.ArrayList;

public class Driver{
    public static void main(String args[]){
        MusicDownloads webMusicA = new MusicDownloads();
        webMusicA.getDownloadList().get(0).timesDownloaded = 5;
        webMusicA.getDownloadList().get(1).timesDownloaded = 3;
        webMusicA.getDownloadList().get(2).timesDownloaded = 10;
        /*DownloadInfo ex = webMusicA.getDownloadInfo("Aqualung");
        DownloadInfo a = webMusicA.getDownloadInfo("Happy Birthday");
        System.out.println(ex);
        System.out.println(a);*/
        
        List<String> b = new ArrayList<String>();
        b.add("Lights");
        b.add("Aqualung");
        b.add("Soul Sister");
        b.add("Go Now");
        b.add("Lights");
        b.add("Soul Sister");
        webMusicA.updateDownloads(b);
        System.out.println(webMusicA);
    }
}