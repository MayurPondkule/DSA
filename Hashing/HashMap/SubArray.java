public class SubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int x=5;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    // sum+=arr[k];
                    // if(sum==x){
                    //     System.out.println("("+i+","+j+")");

                    // }
                }
                // System.out.println("sum is "+sum);
                System.out.println();
            }
        }
    }    
}
