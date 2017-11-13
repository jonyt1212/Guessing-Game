public class nameThatCelebrity{
    public static void main(String args[]){
       String s1 = "Allan Alda";
       String s2 = "John Wayne";
       String s3 = "Gregory Peck";
       /*int space = 0;
       
       for(int i = 0; i<s1.length(); i++){
           if(s1.substring(i, i+1).equals(" ")){
               space = i;
            }
        }
       System.out.println(space);*/
       
       String s1_beg = s1.substring(2, (s1.length() - 3));
       System.out.println(s1_beg);
    }
}