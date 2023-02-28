import java.util.ArrayList;
import java.util.Collections;


class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();

        list1.add(4);
        list1.add(77);
        list1.add(54);
        list1.add(42);
        list1.add(42);
        list1.remove(Integer.valueOf(77));
        System.out.println(list1);

        //add ele
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(5);
        // System.out.println(list);

        // //get element
        // int element=list.get(0);
        // System.out.println(element);

        // //add ele in between
        // list.add(3,4);
        // System.out.println(list);


        // //set element (replace element)
        // list.set(4, 6);
        // System.err.println(list);

        // //delete element
        // list.remove(4);
        // System.out.println(list);

        // //size
        // // int size=list.size();
        // System.out.println(list.size());

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }

        // //sorting
        // Collections.sort(list1);
        // System.out.println(list1);

    }
}