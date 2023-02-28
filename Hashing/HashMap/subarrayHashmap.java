import java.util.HashMap;




public class subarrayHashmap {


    public static void SubArraySum(int arr[],int sum){
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr_sum=0;
        int start=0;
        int end=-1;
        //key---curr_sum
        //value--index
        
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            
            if(curr_sum==sum){
                start=0;
                end=i;
                break;
    
            }
            if(map.containsKey(curr_sum-sum)){
                start=map.get(curr_sum-sum)+1;
                end=i;
                break;
            }
            map.put(curr_sum, i);
                        
            
        }
    
        if(end==-1){
            System.out.println("sum not found lol");
        }
        else{
            System.out.println(start+" "+end);
        }
    
    
    }
    

    
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int sum=5;
        
        SubArraySum(arr,sum);

        
    }


    
}
