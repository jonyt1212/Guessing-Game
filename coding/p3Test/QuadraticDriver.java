public class QuadraticDriver{
    public static void main(String args[]){
        QuadraticEquation quad1 = new QuadraticEquation(3, -9, -12);
        System.out.println(quad1.getB());
        System.out.println(quad1);
        System.out.println("\n");
        QuadraticEquation quad2 = new QuadraticEquation(2, 1, 12);
        System.out.println(quad2);
    }
}