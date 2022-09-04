/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome{

public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    CheckPalindrome(str);
   
}
    public static void CheckPalindrome(String str){
      //comcepts create a new string of reverse 
     String rev = "";
     for(int i=str.length()-1;i>=0;i--){
         rev+=str.charAt(i);
     }
     if(str.equals(rev)){
         System.out.println("String is palindrome");
     }
     else
        System.out.println("String is not Palindrome ");    }
}