import java.util.ArrayList;

class Solution
{
    

    public static void main(String[] args) {
        int n=5;
        int s=12;
        int arr[]={1,2,3,7,5};
       
        ArrayList<Integer> l=new ArrayList<>(2);
        // Your code here
        int curr_sum;
        for(int i=0;i<n;i++){
            curr_sum=0;
            curr_sum=arr[i];
           
            
            for(int j=i+1;j<n;j++){
                if(curr_sum==s){
                    l.add(i);
                    l.add(j);
                    System.out.println(l);
                }
                
                if(curr_sum>s ||j==n-1){
                    break;
                }
                
                curr_sum+=arr[j];
            }
        
        }
        
        if(l.isEmpty()){
            l.add(-1);
        }
        
        
        System.out.println(l);
        
    }
}