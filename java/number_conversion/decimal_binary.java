package number_conversion;
import java.util.Scanner;
public class decimal_binary {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in); 
        System.out.print("THIS PROGRAM CONVERT DECIMAL NUMBER TO BINARY NUMBER=");
        int dec=sc.nextInt();
        int ans=0;
        int pow=1;
        while(dec>0){ 
            int parity=dec%2;
            ans+=parity*pow;
            pow*=10;
            dec/=2;
        }
        System.out.println( "INTO BINARY NUMBER="+ans);

    }
    
}
