package number_conversion;
import java.util.Scanner;
public class binary_decimal {
    public static void main(String[] args) {

        System.out.println("THIS PROGRAM WILL CONVERT BINARY NUMBER TO DECIMAL NUMBER");
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter binary number");
        long bin=sc.nextInt();
        int ans=0;
        int pow=1;//power of two 
        while(bin>0){
            long unt=bin%10;
            ans+=unt*pow;
            pow*=2;
            bin=bin/10;
 }
        System.out.println("VALUE OF BINARY NUMBER INTO DECIMAL="+ans);


    }
    
}
