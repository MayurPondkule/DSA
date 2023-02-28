public class SubArray{
    public static void main(String[] args) {

       int array[]={1,2,3};
           
       for(int i=0;i<array.length;i++){
        for(int j=i;j<array.length;j++){
            // System.out.println(i+" "+j);
            for(int k=i;k<=j;k++){
                System.out.print(array[k]+" ");  //print all subarray
                
                
                
            }
            System.out.println();
        }
       }
    }
}