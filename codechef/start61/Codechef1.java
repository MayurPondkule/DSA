/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int n=sc.nextInt();
		    int[] arr=new int[n];
		    
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int count=0;
		    
		    for(int i=0;i<n;i++){
		        for(int j=1;j<n;j++){
		            for(int k=i;k<=j;k++){
                        // System.out.println(arr[k]+" ");
                        count++;
 
		            }
                    
		        }
		    }

            System.out.println(count);
		    
		    
		    
		    t--;
		}
	}
}
