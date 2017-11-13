public class P2F{
    public static void main(String args[]){
        double[] arr = new double[9];
        double num;
        double max = 0;
        
        for(int i=0; i < arr.length; i++){
            num = Math.random() * 0.5;
            arr[i] = num;
        }
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        
        for(int i=0; i < arr.length; i++){
            arr[i] += 0.02;
        }
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}