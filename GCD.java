import java.util.Scanner;


class  GCD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
    static int gcd(int a, int b){
        if(a==0)
        return b;
        return gcd(a, b);
    }
    
}