import java.util.ArrayList;
import java.util.HashSet;

// import java.util.;

public class ThreeArray{
    public static void main(String[] args) {

        int a[]={1,6,3};
        int b[]={3,4,5};
        int c[]={5,6,7};

        ArrayList<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
            
        }

        for(int i:c){
            if(set.contains(i)){
                list.add(i);
                set.remove(i);

            }
        }

        System.out.println(list);

        

       



        
    }
} 