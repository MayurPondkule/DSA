import java.util.Scanner;

class Kthmin{
    public static void main(String[] args) {
        
        int arr[]={66,43,6,56,890};

        int min=0;

        if(arr[0]>arr[1]){
            min=arr[1];
        }
        else{
            min=arr[0];
        }
        int index=0;

        for(int i=2;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }

        System.out.println(min+" "+index);


    }
}