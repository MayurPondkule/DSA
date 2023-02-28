/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0){
		    int a=sc.nextInt();
		    String str=sc.next();
		    int count=0;
		    
		    for(int i=0;i<a-1;i++){
		        if(str.charAt(i)==str.charAt(i+1)){
		            count++;
		        }
		    }
		    System.out.println(count);
		    
		    t--;
		}
	}
}
