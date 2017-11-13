public class p1G{
    public static void main(String args[]){
        int[] nums = new int[10];
        int num_pos = 0;
        
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)(Math.random() * 100);
            if(Math.random() > 0.5){
                nums[i] *= -1;
            }
        }
        
        for(int a=0;a<nums.length; a++){
            System.out.println(nums[a]);
        }
        
        for(int b=0; b<nums.length;b++){
            if(nums[b]>0){
                num_pos++;
            }
        }
        System.out.println("There are " + num_pos + " positive numbers");
    }
}