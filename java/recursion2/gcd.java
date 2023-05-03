package recursion2;
import java.util.Scanner;
public class gcd {
    static int hcf(int x,int y){
        if(y==0)
        return x;
       return hcf(y,x%y);

    }
    public static void main(String[] args) {
        System.out.println("this program find HCF of of two number");
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number=");
        int x=sc.nextInt();
        System.out.print("enter second number=");

        int y=sc.nextInt();
       System.out.println("hcf="+ hcf(x,y));
    } 
    
}
