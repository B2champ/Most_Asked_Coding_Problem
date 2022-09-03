import java.util.Scanner;


class reverseDigit{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        r_num(num);
    }
    public static void r_num(int num){
        int rnum = 0;
        while(num>0){
            rnum = rnum*10+num%10;
            num/=10;
        }
        System.out.println(rnum);
    }
}