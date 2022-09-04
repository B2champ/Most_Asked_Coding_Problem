/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factor{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        findfactor(a);
    }
    public static void findfactor(int a){
        int i =1;
        
    while(i!=0){
        if(a%i==0){
            System.out.println(i+" ");
        }
        i++;
    }
    }
}

