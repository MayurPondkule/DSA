import java.util.*;

public class Maxmin{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int max=0;
        int min=0;

        int n=sc.nextInt();

        int[] array=new int[n];

        for(int i=0;i<n;i++){

            array[i]=sc.nextInt();
        }

        if(n==1){
            min=array[0];
            max=array[0];
          
        }

        if(array[0]>array[1]){
            max=array[0];
            min=array[1];
        }
        else{
            max=array[1];
            min=array[0];
        }

        for(int i=2;i<n;i++){
            if(array[i]>max){
                max=array[i];
            }
            else if(array[i]<min){
                min=array[i];
            }
        }

        System.out.println("max is "+max);
        System.out.println("min is "+min);


        




        
        
    }
}