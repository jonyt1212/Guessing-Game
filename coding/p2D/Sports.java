public class Sports{
    public String sport;
    public int ranking;
    
    public Sports(){
        sport = null;
        ranking = 0;
    }
    
    public Sports(String s, int r){
        sport = s;
        ranking = r;
    }
    
    public String toString(){
        return "You are in place " + ranking + " in " + sport;
    }
}