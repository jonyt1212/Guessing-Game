public class QuadraticEquation{
    private int a;
    private int b;
    private int c;
    
    public QuadraticEquation(){
        a = 0;
        b = 0;
        c = 0;
    }
    
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getB(){
        return b;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public int calcDiscriminant(){
        //b^2 - 4ac
        return (int)(Math.pow(b, 2) - (4*a*c));
    }
    
    public double calcRoot1(){
        return ((-b + Math.sqrt(calcDiscriminant()))/(2*a));
    }
    
    public double calcRoot2(){
        return ((-b - Math.sqrt(calcDiscriminant()))/(2*a));
    }
    
    public String toString(){
        if(calcDiscriminant() >= 0){
            return ("The quadratic equation is " + a + "x^2 + " + b + "x + " + c + " = 0\nThe discriminant is: "
                    + calcDiscriminant() + "\nRoot 1 is: " + calcRoot1() + "\nRoot 2 is: " + calcRoot2());
        } else{
            return ("The quadratic equation is " + a + "x^2 + " + b + "x + " + c + " = 0\nThe value of the discriminant is: " + 
                    + calcDiscriminant() + "\nThere are no real roots.");
        }
    }
}