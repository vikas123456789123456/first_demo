package recursion2;
import java.util.Scanner;
public class sum_digit {
    static int sod(int n){
        if(n>=0 && n<=9)
         return n;
         return sod(n/10)+n%10;

    }

    public static void main(String[] args) {
        System.out.println("This program calulated the sum of digit of given number");
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number=");
        int n=sc.nextInt();
        System.out.println("sum of digit of number="+sod(n));
    }
    
}
