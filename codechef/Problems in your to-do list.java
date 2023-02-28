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
	    int T=sc.nextInt();
	    
	        
	    int count=0;
	    
	    int size=sc.nextInt();
	    
	    int[] array= new int[size];
	    
	    for(int i=0;i<size;i++){
	        
	        array[i]=sc.nextInt();
	        
	        if(array[i]>=1000){
	            
	            count=count+1;
	            
	        }


			System.out.println(count);
	        
	        
	    }
	    T--;
	    
	    }
	    
	    
	    
	    
	   
	    
	    
		// your code goes here
	}

