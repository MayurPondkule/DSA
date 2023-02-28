import java.util.Scanner;

public class Greatestcommondivisor {

    public static void gCD(int a,int b){

        while(a!=b){
            if(a>b){
                a=a-b;

            }
            else{
                b=b-a;
            }
        }
        System.out.println(b);
              
        

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        gCD(a, b);

                
    }
    
}
