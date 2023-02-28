/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t!=0){
		    int count1=0;
	     	int count2=0;
		    
		    int s=sc.nextInt();
		    while(s!=0){
		        
		        String str=sc.next();
		        
		        if(str.equals("START38")){
		            
		            count1++;
		            
		        }
		        if(str.equals("LTIME108")){
		            count2++;
		        }
		        s--;
		    
		    }
		 
		    System.out.println(count1+" "+count2);
		    t--;
		}
	
	}
}
