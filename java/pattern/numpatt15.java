package pattern;
import java.util.Scanner;
public class numpatt15 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=0;j<x-i;j++)
             System.out.print("1");
             for(int k=1;k<=i;k++)
              System.out.print(i);
              System.out.println();

        }

    }
    
}
