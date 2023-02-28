// Chef has the binary representation SS of a number XX with him. He can modify the number by applying the following operation exactly once:

// Make X := X \oplus \lfloor \frac{X}{2^{Y}} \rfloorX:=X⊕⌊ 
// 2 
// Y
 
// X
// ​
//  ⌋, where (1 \leq Y \leq |S|)(1≤Y≤∣S∣) 

//  4                   
// 2
// 10
// 2
// 11
// 3
// 101
// 3
// 110

// output
// 1
// 2
// 1
// 2

// Explanation:
// Test case 11: Since S = 10S=10 is the binary representation of 22, the current value of X = 2X=2. On choosing Y = 1Y=1, XX becomes 2 \oplus \lfloor \frac{2}{2^{1}} \rfloor = 32⊕⌊ 
// 2 
// 1
 
// 2
// ​
//  ⌋=3. We can show that this is the maximum value of XX we can achieve after one operation.

// Test case 22: Since S = 11S=11 is the binary representation of 33, the current value of X = 3X=3. On choosing Y = 2Y=2, XX becomes 3 \oplus \lfloor \frac{3}{2^{2}} \rfloor = 33⊕⌊ 
// 2 
// 2
 
// 3
// ​
//  ⌋=3. We can show that this is the maximum value of XX we can achieve after one operation.

// Test case 33: Since S = 101S=101 is the binary representation of 55, the current value of X = 5X=5. On choosing Y = 1Y=1, XX becomes 5 \oplus \lfloor \frac{5}{2^{1}} \rfloor = 75⊕⌊ 
// 2 
// 1
 
// 5
// ​
//  ⌋=7. We can show that this is the maximum value of XX we can achieve after one operation.

// Test case 44: Since S = 110S=110 is the binary representation of 66, the current value of X = 6X=6. On choosing Y = 2Y=2, XX becomes 6 \oplus \lfloor \frac{6}{2^{2}} \rfloor = 76⊕⌊ 
// 2 
// 2
 
// 6
// ​
//  ⌋=7. We can show that this is the maximum value of XX we can achieve after one operation.






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
		    int count=1;
		    
		    for(int i=1;i<a;i++){
		        if(s.charAt(i)=='1'){
		            count++;
		        }
		        
		        else{
		            break;
		        }
		    }
		    
		    System.out.println(count);
		    
		    
		    t--;
		}
	}
}
