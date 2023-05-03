package pattern;
import java.util.Scanner;
public class chpatt2 {
    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        int al=65;
        for(int i=0;i<x;i++){
            for(int j=0;j<=i;j++)
            System.out.print((char)(al+i)+" ");
            System.out.println();
        }
        
    }
    
}
