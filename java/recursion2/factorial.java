package recursion2;
import java.util.Scanner;
public class factorial {
    static int fact(int n){
        if(n==1)
        return 1;
        return n* fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("This program return the factorial of given number");
        Scanner sc= new Scanner(System .in);
        System.out.print("Enter the number =");
        int n=sc.nextInt();
        System.out.println( "factorial="+fact(n));
    }
}
