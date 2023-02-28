import java.util.Scanner;

class Fact{


    public static void printFactorial(int n){

        if(n<0){
            System.out.println("invalid");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        // return factorial;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        // int factorial=printFactorial(n);
        // System.out.println(factorial);

       printFactorial(n);


        
    }
}