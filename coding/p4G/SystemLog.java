import java.util.List;
import java.util.ArrayList;

public class SystemLog{
    private List<LogMessage> messageList = new ArrayList<LogMessage>();
    
    public SystemLog(){
        messageList.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
        messageList.add(new LogMessage("Webserver:disk offline"));
        messageList.add(new LogMessage("SERVER1:file not found"));
        messageList.add(new LogMessage("SERVER2:read error on disk DSK1"));
        messageList.add(new LogMessage("SERVER1:write error on disk DSK2"));
        messageList.add(new LogMessage("Webserver:error on /dev/disk"));
    }
    
    public List<LogMessage> removeMessages(String keyword){
        List<LogMessage> returnList = new ArrayList<LogMessage>();
        for(int i = messageList.size()-1; i>= 0; i--){
            if(messageList.get(i).containsWord(keyword)){
                returnList.add(messageList.get(i));
                messageList.remove(i);
            }  
        }
        return returnList;
    }
    
    public String toString(){
        String ret = "";
        for(LogMessage obj: messageList){
            ret += obj.getMachineId() + ":" + obj.getDescription() + "\n";
        }
        return ret;
    }
}