//  HashSet.union of 2 array;
import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4};
        int arr2[]={2,3,4,5,6};
        
        HashSet<Integer> set =new HashSet<>();

        for (int x: arr1){
            set.add(x);
        }

        for(int x: arr2){
            set.add(x);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
    
}
