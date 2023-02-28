import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        
        int sum=0;
        
        int[] output=new int[2];
        
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    
                    output[0]=i; 
                     output[1]=j;
     
                }
}
     
        }
        
        return output;
        
             
        
    }
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        int nums[]={2,7,11,15};
        
       
        int target=sc.nextInt();
        
        System.out.println(Arrays.toString(twoSum( nums,  target)));
        
        
    

    
    }
}