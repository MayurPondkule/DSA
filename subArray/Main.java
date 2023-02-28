import java.util.Arrays;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int targetSum = 9;
        
    ArrayList<Integer> l= findSubarray(arr,targetSum);
    System.out.println(l);

  
  }

  public static ArrayList<Integer> findSubarray(int[] arr, int targetSum) {
    ArrayList<Integer> l=new ArrayList<>();
   
    for (int i = 0; i < arr.length; i++) {

      int currentSum = arr[i];
      
      if (currentSum == targetSum) {
        l.add(i);
        l.add(i);
        return l;
      }


      for (int j = i + 1; j < arr.length; j++) {
        if(currentSum>targetSum){
            break;
        }
       
        currentSum += arr[j];
        
        if (currentSum == targetSum) {
          l.add(i);
          l.add(j);
          return l;
        }
      }
    }
    
    l.add(-1);
    return l;
  }


}
