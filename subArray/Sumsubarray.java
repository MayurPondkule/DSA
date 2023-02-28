public class Sumsubarray {
    public static void main(String[] args) {
        
        int arr[]={1,2,3};
        int s=3;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==s){
                        System.out.println(i+" "+j);
                    }
                    
                }
            }

        }


    }
    
}
