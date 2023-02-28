import java.util.*;

public class Hashing{
   public static void main(String[] args) {

    HashMap<String,Integer> map=new HashMap<>(2);

    map.put("india", 100);
    map.put("usa", 200);
    map.put("china", 300);
    map.put("china", 0);

    // // search
    // if(map.containsKey("india")){
    //     System.out.println("yes present");
    // }
    // else{
    //     System.out.println("not present");
    // }

    // //get value of key
    // System.out.println(map.get("india"));
    // System.out.println(map.get("indi"));
    
    //iteration
    //for(int val :arr)
    //entry (pair)

    // for(Map.Entry<String,Integer> e : map.entrySet()){
    //     System.out.print(e.getKey()+' ');
    //     System.out.println(e.getValue());
    // }

    //only keys ka set banake  (key set method)

    // Set<String> keys= map.keySet();
    // for(String key : keys){
    //     System.out.println(key+" "+map.get(key));
    // }


    //remove
    // map.remove("china");
    System.out.println(map);



    

    // System.out.println(map);

        
    }
    
}








class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (mapa.containsKey(nums[i])) {
                ans[0] = mapa.get(nums[i]);
                ans[1] = i;
            System.out.println(i);
                return ans;
            }
            mapa.put(target - nums[i], i);
        }
        return ans;
    }
}