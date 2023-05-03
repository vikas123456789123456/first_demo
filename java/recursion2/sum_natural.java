package recursion2;
import java.util.Scanner;
public class sum_natural {

  /*  static int sum(int n){
        if(n==0)
        return 0;
        return n+sum(n-1);}*/

        static int sum(int n){ // for sum of sum of number like 1-2+3-4+5.....n
            if(n==0)
            return 0;   
            if(n%2==0)
            return sum(n-1)-n;
            else
            return sum(n-1)+n;
            
        }
   public static void main(String[] args) {
        System.out.println("This program return the sum of first n natural number");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number=");
        int n=sc.nextInt();
        System.out.println("sum of first n natural number="+sum(n));;


    }
    
}
