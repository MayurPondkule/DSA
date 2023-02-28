import java.util.Scanner;

class Fact{


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        while(t!=0){
            
            int f=sc.nextInt();
            int fact=1;

            for(int i=1;i<=f;i++){

                fact=fact*i;               

            }

            System.out.println(fact);
        }
        
    }
}