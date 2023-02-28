/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prettynumber1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		    int count=0;
		    int m=sc.nextInt();
		    int j=sc.nextInt();
		    
		    for(int i=m; i<=j;i++){
				
		        if(i%10==2 ){
		            count++;
		        }
				if(i%10==3 ){
		            count++;
		        }
				if(i%10==9 ){
		            count++;
		        }
		    }
		    
		    System.out.println(count);
		
	}
}

