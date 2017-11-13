import java.util.List;
import java.util.ArrayList;

public class Driver{
    public static void main(String args[]){
        /*String test = "machineId:diskette";
        LogMessage a = new LogMessage(test);
        System.out.println(a.containsWord("disk"));
        */
        
        SystemLog theLog = new SystemLog();
        System.out.println(theLog + "\n");
        List<LogMessage> removed = theLog.removeMessages("disk");
        String str = "";
        for(LogMessage obj: removed){
            str += obj.getMachineId() + ":" + obj.getDescription() + "\n";
        }
        System.out.println(str + "\n");
        System.out.println(theLog);
    }
}