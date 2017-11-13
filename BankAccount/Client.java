public class Client{
    public String first;
    public String last;
    public String username;
    public String password;
    public double accBalancePersonal;
    public double accBalanceBusiness;
    
    public Client(String f, String l, String u, String p, double aBP, double aBB){
        first = f;
        last = l;
        username = u;
        password = p;
        accBalancePersonal = aBP;
        accBalanceBusiness = aBB;
    }
    
    public void deposit(String type){
        Scanner reads = new Scanner(Syste);
        if(type.equals("personal")){
            accBalancePersonal += d;
        } else if(type.equals("business")){
            accBalanceBusiness += d;
        }
    }
    
    public void withdrawal(double w, String type){
        if(type.equals("personal")){
            accBalancePersonal -= w;
        } else if(type.equals("business")){
            accBalanceBusiness -= w;
        }
    }
    
    public double balance(String type){
        double balance = 0;
        if(type.equals("personal")){
            balance = accBalancePersonal;
        } else if(type.equals("business")){
            balance = accBalanceBusiness;
        }
        return balance;
    }
}