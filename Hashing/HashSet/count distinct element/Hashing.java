import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        
        int array[]={5,10,15,5,3,3};

        // int count=0;  n^2
        // for(int i=0;i<array.length;i++){
        //     int j=0;
        //     for(j=0;j<i;j++){
        //         if(array[i]==array[j]){
        //             break;
        //         }
              
        //     }
        //     if(i==j){
        //         count++;
        //     }
            
        // }

        // System.out.println(count);

        //by sorting
        // int count = 0;
        // for (int i = 0; i < array.length; i++) {
 
        //     // Move the index ahead while
        //     // there are duplicates
        //     while (i < array.length - 1 && array[i] == array[i + 1]) {
        //         i++;
        //     }
        //     count++;
        // }


        //by hashSet  

        HashSet<Integer> set=new HashSet<>();
        for( int element :array){
            set.add(element);
        }
        System.out.println(set.size());

    }
    
}
