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
        return "The time is " + hour + ":" + minute + ":" + second;
    }
}