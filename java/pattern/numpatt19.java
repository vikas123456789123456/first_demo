package pattern;
import java.util.Scanner;
public class numpatt19 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
          //  System.out.print("          ");
            for(int j=1;j<=n-i;j++)
            System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)
             System.out.print("*"+"");
             System.out.println();
 
            
        }

    }
}
