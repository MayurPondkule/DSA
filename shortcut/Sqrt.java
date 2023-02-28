

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Sqrt
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner sc = new Scanner(System.in);
    	int cases = sc.nextInt();
    	for (int i = 0 ; i < cases; i++){
    	    int n = sc.nextInt();
    	    
    	    System.out.println((float)Math.sqrt(n));
    	} 
	}
}


