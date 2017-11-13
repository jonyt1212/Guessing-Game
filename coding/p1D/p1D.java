public class p1D{
    public static void main(String[] args){
        int rand;
        for(int i=1; i < 11; i++){
            rand = (int)(Math.random()*i*i);
            if(rand < i){
                rand = rand + i;
            }
            System.out.println(i + "\t" + i*i + "\t" + rand);
        }
    }
}