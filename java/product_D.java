5import java.util.Scanner;
public class product_D {
    public static void main(String[] args){
        System.out.println("this program will return the product of digit of number");
        Scanner s=new Scanner(System.in);
        int pro=1,num;
        System.out.print("enter the number=");
        num=s.nextInt();
        while(num>0){
            pro=pro*(num%10);
            num=num/10;
        }System.out.println("product of the given number="+pro);

        // PROGRAM NO=2
        System.out.println("THIS PROGRAM WILL RETURN THE SUM OF EVEN AND PRODUCT OF ODD DIGIT OF GIVEN NUMBER");
        System.out.print("enter the number");
        int p=1,n,sum=0,d;
        n=s.nextInt();
        while(n>0){
            d=n%10;
            if(d%2==0)
                sum=sum+d;
            else
            p=p*d;
          n=n/10;

        }System.out.println("sum of the digit="+sum);
        System.out.println("product of the digit="+p);
    }
    
}
