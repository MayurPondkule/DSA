import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static int[] twoSum(int[] arr,int target){
       
        
        int[] output=new int[2];

        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    output[0]=i;
                    output[1]=j;
                                     
                }
            }

        }
        return output;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,4};
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(arr, target)));
        
    }
}
