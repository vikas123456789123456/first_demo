package pattern;
import java.util.Scanner;

public class tri2 {
    public static void main (String [] args){
        System.out.println("THIS WILL PRINT OPPOSITE RIGHT TRIANGLE");

        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE ROWS=");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=x-i;j++)
             System.out.print(" ");
            for(int k=1;k<=i;k++)
             System.out.print("*"+" ");//replace space for triangle otherwise get pyramid shape
            System.out.println();

        }
    }
    
}

