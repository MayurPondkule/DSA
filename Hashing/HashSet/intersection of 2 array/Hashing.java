import java.util.HashSet;

// HashSet.intersection of 2 array;

public class Hashing {

    public static void main(String[] args) {
        
        int arr1[]={1,2,3,4};
        int arr2[]={6,1,4,1};
        int count=0;

        HashSet<Integer> set=new HashSet<>();

        for(int element:arr1){
            set.add(element);
        }

        for(int element:arr2){

            if(set.contains(element)){
                count++;
                System.out.println(element);
                set.remove(element);
           
            }
          
        }

        System.out.println(count);
        System.out.println(set);

    }
    
}
