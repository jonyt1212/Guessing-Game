public class Clock{
    public int hour;
    public int minute;
    public int second;
    
    public Clock(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    
    public Clock(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
    
    public String toString(){
        return "The time is " + hour + ":" + minute + ":" + second + ". This is a total of " + totalSeconds() + " seconds.";
    }
    
    public void setTime(int h, int m, int s){
        hour = h;
        minute = m;
        second = s;
    }
    
    public void convertDaylightSaving(int hours){
        hour += hours;
    }
    
    public int totalSeconds(){
        return ((3600 * hour) + (60 * minute) + (second));
    }
}