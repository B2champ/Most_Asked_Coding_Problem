/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Factor{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       perfectnum(a);
    }
    public static void perfectnum(int a){
        int total =0;
        int i =1;
        while(i<a){
            if(a%i==0){
                total+=i;
            }
          i++;  
    }
     if(total==a){
                System.out.println("YEs");
        }
        else{
            System.out.println("NO");
        }
    }
    
}

