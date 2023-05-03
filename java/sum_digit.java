import java.util.Scanner;
public class sum_digit {
    public static void main(String [] args){
        System.out.println("This program will return the sum of digit of the number");
        Scanner sc=new Scanner(System.in);
        int sum=0,n;
        
        System.out.print("enter the number=");
        n=sc.nextInt();
        while(n>0){
        sum=sum+(n%10);
        n=n/10;
    }
        System.out.println("Sum of digit="+sum);

    }
}
