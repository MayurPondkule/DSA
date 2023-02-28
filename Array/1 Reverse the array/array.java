import java.util.Scanner;

public class array {

    

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter subjects");
        int size=sc.nextInt();

        int[] marks=new int[size];
    // int marks[]={68,3,16}; 
    // marks[0]=68;
    // marks[1]=3;
    // marks[2]=16;

    // System.out.println(marks[0]);
    // System.out.println(marks[1]);
    // System.out.println(marks[2]);
    System.out.println("enter marks ");
    for(int i=0;i<size;i++){
        marks[i]=sc.nextInt();
    }

    System.out.println("marks of sub are");

    for(int i=0;i<size;i++){
        System.out.println(marks[i]);
    }

    //for reverse 
    System.out.println("reverse of marks is:");
    for(int i=size-1;i>=0;i--){
        System.out.println(marks[i]);

    }




        
    }
    
}