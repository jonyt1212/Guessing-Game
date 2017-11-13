public class P2G{
    public static void main(String args[]){
        String[] arr = {"UCLA", "USC", "Burkeley", "NYU"};
        String name;
        int oldLength = 0;
        int length;
        String longest = null;
        
        for(int i=0; i<arr.length; i++){
            name = new String(arr[i]);
            length = name.length();
            System.out.print(length + "  ");
            if(length > oldLength){
                longest = new String(name);
            }
            oldLength = length;
        }
        
        System.out.println("\n" + longest);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}