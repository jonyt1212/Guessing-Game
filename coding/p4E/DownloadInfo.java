public class DownloadInfo{
    /**Creates a new instance with the given unique title and sets the
     * number of times downloaded to 1.
     * @param title the unique title of the download song
     */
    private String title;
    public int timesDownloaded;
    
    public DownloadInfo(String t){
        title = t;
        timesDownloaded = 1;
    }
    
    /**@return the title*/
    public String getTitle(){
        return title;
    }
    
    /**Increment the number time downloaded by 1*/
    public void incrementTimesDownloaded(){
        timesDownloaded+=1;
    }
    
    public String toString(){
        return ("The song " + title + " has been downloaded " + timesDownloaded + " times.");
    }
    
    //There may be instance variables, constructors, and methods that are not shown
}