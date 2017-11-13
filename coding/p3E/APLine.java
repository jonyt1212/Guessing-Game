class APLine{
    public int a;
    public int b;
    public int c;
    
    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope(){
        return -a/(double)b;
    }
    
    public boolean isOnLine(double x, double y){
        return (a*x + b*y + c == 0);
    }
}