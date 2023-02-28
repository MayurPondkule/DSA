public class Swapalternate{

    static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void swap(int arr[],int n){
        for(int i=0;i<n;i+=2){
            if(i+1<n){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }
        }

    }
    public static void main(String[] args) {
        int even[]={1,2,3,4,5,6,7,8};
        int odd[]={6,3,87,4};
        // swap(even,8);
        // print(even,8);
        swap(odd,4);
        print(odd,4);
        

        
    }
}