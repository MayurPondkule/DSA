import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String args[]){

        HashSet<Integer> set=new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        

        //Search-contains
        // if(set.contains(1)){
        //     System.out.println("1 is contain");
        // }
        // if(!set.contains(6)){
        //     System.out.println("6 not contains");
        // }

        // //delete 
        // if(set.remove(1)){
        //     System.out.println("deleted 1");
        // }

        // //size of set
        // System.out.println("size of set"+set.size());

        //Iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

       






        // System.out.println(set);

       
    }
}