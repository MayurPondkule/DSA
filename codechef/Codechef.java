/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] array1=new int[N];
		int[] array2=new int[N];
		int win=1;
        int max_diff=0;
        int diff=0;
		for(int i=0;i<N;i++){
		    
		     array1[i]=sc.nextInt();
		     array2[i]=sc.nextInt();
		    
		    if(array1[i]>array2[i]){
		        diff=array1[i]-array2[i];
                if(diff>max_diff){
                    max_diff=diff;
                    win=1;
                }
		        
		        
		    }
		    
		    else{
		        diff=array2[i]-array1[i];
                if(diff>max_diff){
                    max_diff=diff;
                    win=2;
                }
		    }
		    
		    
		    
		  
		}
        System.out.println(win+" "+max_diff);
		
		
	}
}
