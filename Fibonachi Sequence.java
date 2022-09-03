import java.util.Scanner;


class Fibocci_Seq{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        Fibocci(n);
        System.out.println();
        System.out.print(0+" "+1);
        fibocci(n,0,1);
    }
    // Iterative way to print fibonacchi sequence
    public static void Fibocci(int n){
        int a =0;
        int b =1;
        System.out.print(a+" "+b);
        while(n-2>0){
            int c = b+a;
            System.out.print(" "+c);
            a=b;
            b=c;
            n--;
        }
    }
    // recrsive call to print fibonacchi sequence
    public static void fibocci(int n,int a, int b){
        if(n-2==0)
        return;
        int c =a+b;
        System.out.print(" "+c+" ");
        fibocci(n-1,b,c);
        
    }
}