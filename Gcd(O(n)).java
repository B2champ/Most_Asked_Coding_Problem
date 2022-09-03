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
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int c = gcd(p,q);
		System.out.println(c);
	}
	static int gcd(int a, int b){
	    int result = Math.min(a,b);
	    while(result -->0){
	        if((a%result==0) &&(b%result ==0)){
	            break;
	            
	        }
	    }
	    return result;
	}
}
