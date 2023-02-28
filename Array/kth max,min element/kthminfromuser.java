import java.util.Scanner;

public class kthminfromuser {

    public static void main(String[] args) {
        int array[]={6,4,8,2};
        
        //bubble sort use
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    //swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter from which index smallest element you want");
        int k=sc.nextInt();
        System.out.println(array[k]);
        

        
    }
    
}
