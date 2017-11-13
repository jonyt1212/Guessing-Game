public class LogMessage{
    private String machineId;
    private String description;
    
    public LogMessage(String message){
        int i = 0;
        for(i=0; i<message.length(); i++){
            if(message.charAt(i) == ':'){
                break;
            }
        }
        machineId = message.substring(0, i);
        description = message.substring(i+1, message.length());
    }
    
    /**Returns true if the description in this log message properly contains keyword;
     *          false otherwise.
     */
    public boolean containsWord(String keyword){
        boolean contains = false;
        if(description.indexOf(keyword) != -1){
            if(description.indexOf(keyword) == 0 || description.charAt(description.indexOf(keyword) - 1) == ' ' || description.charAt(description.lastIndexOf(keyword) - 1) == ' '){
                if(description.indexOf(keyword) == description.length() - keyword.length() || description.charAt(description.indexOf(keyword) + keyword.length()) == ' '){
                    contains = true;
                }
            }
        }
        return contains;
    }
    
    public String getMachineId(){
        return machineId;
    }
    
    public String getDescription(){
        return description;
    }
}