import java.util.Scanner;

public class Fiboo {  

    public static void fibo(int n){
        int a=0,b=1;

        System.out.print(a+" ");

        for(int i=2;i<=n;i++){               ///n terms
            System.out.print(b+" ");
            int temp=b;
            b=a+b;
            a=temp;
        }                           

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        fibo(n);

        
    }
    
}
