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
		    int a=sc.nextInt();
		    String s=sc.next();
		    int count=0;
		    
		    for(int i=1;i<a;i++){
		        if(s.charAt(i)=='1'){
		            count++;
		        }
		        
		        else{
		            break;
		        }
		    }
		    
		    System.out.print(count);
		    
		    
		    t--;
		}
	}
}
