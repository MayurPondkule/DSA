import java.util.Scanner;

public class Maxmin1 {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int max=0;
        int min=0;

        if(n==1){
            min=arr[0];
            max=arr[0];
        }

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min) {
                min=arr[i];
            }
            
        }
        System.out.println();

        System.out.println("max num in array is "+max);
        System.out.println("min num in array in array "+ min);
        
        


    }
    
}
