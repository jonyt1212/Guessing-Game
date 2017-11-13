public class p1F{
    public static void main(String args[]){
        int[] nums = new int[50];
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*100);
        }
        
        for(int x = 0; x < nums.length; x++){
            System.out.print(nums[x] + " ");
        }
    }
}