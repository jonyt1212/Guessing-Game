public class p3F1{
    public static void main(String args[]){
        String school1 = new String("Stanford");
        String school2 = new String("UT Austin");
        String school3 = new String("UCLA");
        
        System.out.println(school1.compareTo(school2));
        System.out.println(school1.compareTo(school3));
        System.out.println(school2.compareTo(school1));
        System.out.println(school2.compareTo(school3));
        System.out.println(school3.compareTo(school1));
        System.out.println(school3.compareTo(school2));
        /*The output is telling us how much later in the 
          alphabet the first String is compared to the second*/
        /*If compareTo() has the same first letter and a different
           second letter, the second letters of each are
           compared*/
    }
}