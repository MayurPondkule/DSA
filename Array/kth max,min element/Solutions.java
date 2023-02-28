import java.util.Scanner;
class Solutions{
   
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] arr=new int[l];
        
        
        
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1-i;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int k=sc.nextInt();
        
        System.out.println(arr[k]);
        
    }
}
