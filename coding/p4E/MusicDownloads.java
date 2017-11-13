import java.util.List;
import java.util.ArrayList;

public class MusicDownloads{
    /**The list of downloaded information.
     * Guaranteed not to be null and not to contain duplicate titles.
     */
    private List<DownloadInfo> downloadList;
    
    /**Creates the list of downloaded information.*/
    public MusicDownloads(){
        downloadList = new ArrayList<DownloadInfo>();  
        downloadList.add(new DownloadInfo("Hey Jude"));
        downloadList.add(new DownloadInfo("Soul Sister"));
        downloadList.add(new DownloadInfo("Aqualung"));
    }
    
    public List<DownloadInfo> getDownloadList(){
        return downloadList;
    }
    
    public DownloadInfo getDownloadInfo(String title){
        DownloadInfo returner = null;
        for(int i=0; i<downloadList.size(); i++){
            if(downloadList.get(i).getTitle().equals(title)){
                returner = downloadList.get(i);
            }
        }
        return returner;
    }
    
    public void updateDownloads(List<String> titles){
        /*to be implemented in part (b)*/
        for(int i=0; i<titles.size(); i++){
            if(getDownloadInfo(titles.get(i)) != null){
                getDownloadInfo(titles.get(i)).incrementTimesDownloaded();
            } else {
                downloadList.add(new DownloadInfo(titles.get(i)));
            }
        }
    }
    
    public String toString(){
        String returner = "";
        for(DownloadInfo obj: downloadList){
            returner+= obj + "\n";
        }
        return returner;
    }
    
    //There may be instance variables, constructors, and methods that are not shown.
}