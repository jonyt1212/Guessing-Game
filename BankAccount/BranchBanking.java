import java.util.List;
import java.util.ArrayList;
public class BranchBanking{
    public List<Client> clients;
    private Client user;
    
    public BranchBanking(){
        clients = new ArrayList<Client>();
        clients.add(new Client("Spongebob", "Squarepants", "spongerbob", "1234SB", 1000, 1000000));
        clients.add(new Client("Patrick", "Star", "patrickthestar", "1111", 1.23, 0));
        clients.add(new Client("Sandy", "Cheeks", "scienceSandy", "Na3PO4", 999999, 9384939));
        clients.add(new Client("Mr.", "Krabs", "krabz", "no", 1000000000, 1000000000));
    }
    
    public boolean credentials(String u, String p){
        boolean ret = false;
        for(Client obj: clients){
            if(obj.username.equals(u) && obj.password.equals(p)){
                ret = true;
                user = obj;
            }
        }
        return ret;
    }
    
    public String menu(){
        return ("1. Make a deposit into Personal bank account.\n"
        + "2. Make a withdrawal from your Personal bank account.\n"
        + "3. View your Personal bank account balance.\n"
        + "4. Make a deposit into Business bank account.\n"
        + "5. Make a withdrawal from your Business bank account.\n"
        + "6. View your Business bank account balance.\n"
        + "7. Exit the system.");
    }
    
    public void decision(int choice){
        switch(choice){
            case 1:
                user.deposit("Personal");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("You were supposed to enter a digit from 1-7.");
        }
    }
}