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
		String str = sc.next();
		int n = str.length();
		int freq[] = new int[n];
		char [] s = str.toCharArray();
		for(int i=0;i<n;i++){
		    freq[i]=1;
		    for(int j=i+1;j<n;j++){
		        if(s[i]==s[j]){
		            freq[i]++;
		            s[j]='0';
		             
		        }
		    }
		}
		for(int i=0;i<freq.length;i++){
		    if(s[i] != ' ' && s[i]!= '0'){
		        System.out.print(s[i]+" "+freq[i]+"\n");
		    }
		   
		        
		    }

	}
}
